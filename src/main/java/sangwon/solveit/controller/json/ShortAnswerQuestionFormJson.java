package sangwon.solveit.controller.json;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonTypeName("shortAnswer")
public class ShortAnswerQuestionFormJson extends QuestionFormJson {
    private String answer;
}
