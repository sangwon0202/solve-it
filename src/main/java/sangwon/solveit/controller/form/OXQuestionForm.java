package sangwon.solveit.controller.form;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonTypeName("OX")
public class OXQuestionForm extends QuestionForm {
    Character answer;
}
