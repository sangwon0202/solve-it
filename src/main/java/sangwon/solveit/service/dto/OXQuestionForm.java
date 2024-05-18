package sangwon.solveit.service.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import sangwon.solveit.repository.entity.OXQuestion;
import sangwon.solveit.repository.entity.Question;

@Getter
@Setter
public class OXQuestionForm implements QuestionConvertible {
    private String content;
    private boolean answer;

    @Builder
    public OXQuestionForm(String content, boolean answer) {
        this.content = content;
        this.answer = answer;
    }
    @Override
    public Question toEntity(int number) {
        return OXQuestion.builder()
                .number(number)
                .answer(answer)
                .content(content)
                .build();
    }
}
