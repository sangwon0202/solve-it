package sangwon.solveit.controller.DTO;

import lombok.Data;
import sangwon.solveit.service.DTO.QuizUploadParam;
import sangwon.solveit.type.QuestionType;

import java.util.List;

@Data
public class QuizUploadRequest {
    private String title;
    private String brief;
    private List<QuestionInfo> questionList;

    @Data
    public static class QuestionInfo {
        private Long number;
        private String content;
        private QuestionType questionType;
        private String answer;
        private List<QuizUploadParam.ChoiceInfo> choiceList;
    }

    @Data
    public static class ChoiceInfo {
        private Long number;
        private String content;
    }

    public QuizUploadParam toParam() {
        return QuizUploadParam.builder()
                .title(title)
                .brief(brief)
                .questionList(questionList
                        .stream()
                        .map(questionInfo -> QuizUploadParam.QuestionInfo.builder()

                                .number(questionInfo.getNumber())
                                .content(questionInfo.getContent())
                                .answer(questionInfo.getAnswer())
                                .questionType(questionInfo.getQuestionType())

                                .choiceList(questionInfo.getChoiceList()
                                        .stream()
                                        .map(choiceInfo -> QuizUploadParam.ChoiceInfo.builder()

                                                .number(choiceInfo.getNumber())
                                                .content(choiceInfo.getContent())

                                                .build())
                                        .toList()
                                )
                                .build()
                        )
                        .toList())
                .build();
    }
}

