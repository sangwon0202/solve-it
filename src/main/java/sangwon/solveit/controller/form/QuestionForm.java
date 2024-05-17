package sangwon.solveit.controller.form;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "type"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = MultiChoiceQuestionForm.class, name = "multiChoice"),
        @JsonSubTypes.Type(value = OXQuestionForm.class, name = "OX")
})
public class QuestionForm {
    private String content;

}
