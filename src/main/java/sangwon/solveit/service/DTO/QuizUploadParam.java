package sangwon.solveit.service.DTO;

import lombok.Builder;
import lombok.Data;
import sangwon.solveit.repository.entity.Choice;
import sangwon.solveit.repository.entity.Question;
import sangwon.solveit.repository.entity.Quiz;
import sangwon.solveit.repository.entity.User;
import sangwon.solveit.type.QuestionType;

import java.util.List;

@Data
@Builder
public class QuizUploadParam {
    private String title;
    private String brief;
    private List<QuestionInfo> questionList;

    @Data
    @Builder
    public static class QuestionInfo {
        private Long number;
        private String content;
        private QuestionType questionType;
        private String answer;
        private List<ChoiceInfo> choiceList;
    }

    @Data
    @Builder
    public static class ChoiceInfo {
        private Long number;
        private String content;
    }

    public Quiz toEntity(User writer) {
        return Quiz.builder()
                .writer(writer)
                .title(title)
                .brief(brief)
                .questions(questionList
                        .stream()
                        .map(questionInfo -> Question.builder()
                                .number(questionInfo.getNumber())
                                .content(questionInfo.getContent())
                                .questionType(questionInfo.getQuestionType())
                                .answer(questionInfo.getAnswer())
                                .choices(questionInfo.getChoiceList()
                                        .stream()
                                        .map(choiceInfo -> Choice.builder()
                                                .number(choiceInfo.getNumber())
                                                .content(choiceInfo.getContent())
                                                .build())
                                        .toList())
                                .build())
                        .toList())
                .build();
    }
}
