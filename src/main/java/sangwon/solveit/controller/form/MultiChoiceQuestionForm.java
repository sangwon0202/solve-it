package sangwon.solveit.controller.form;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonTypeName("multiChoice")
public class MultiChoiceQuestionForm extends QuestionForm {
    Integer answer;
    List<String> choiceList;
}
