package sangwon.solveit.controller.json;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonTypeName("OX")
public class OXQuestionFormJson extends QuestionFormJson {
    Boolean answer;
}
