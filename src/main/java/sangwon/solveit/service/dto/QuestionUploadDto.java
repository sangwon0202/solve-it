package sangwon.solveit.service.dto;

import lombok.Data;
import sangwon.solveit.repository.entity.Choice;
import sangwon.solveit.repository.entity.Question;
import sangwon.solveit.repository.entity.Quiz;
import sangwon.solveit.type.QuestionType;

import java.util.List;

@Data
public class QuestionUploadDto {
    private Long number;
    private String content;
    private QuestionType questionType;
    private String answer;
    private List<ChoiceUploadDto> choiceList;

    public Question toEntity(Quiz quiz) {
        return Question.builder()
                .quiz(quiz)
                .number(number)
                .content(content)
                .questionType(questionType)
                .answer(answer)
                .build();
    }

}
