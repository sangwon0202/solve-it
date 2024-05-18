package sangwon.solveit.controller.json;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "type"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = MultiChoiceQuestionFormJson.class, name = "multiChoice"),
        @JsonSubTypes.Type(value = ShortAnswerQuestionFormJson.class, name = "shortAnswer"),
        @JsonSubTypes.Type(value = OXQuestionFormJson.class, name = "OX")
})
public class QuestionFormJson {
    @Size(min = 1, max = 100, message = "문항의 질문 길이는 1자 이상 100자 이하입니다.")
    private String content;
}
