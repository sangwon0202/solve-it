package sangwon.solveit.controller.form;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonTypeName("shortAnswer")
public class ShortAnswerQuestionForm extends QuestionForm {
    private String answer;

}
