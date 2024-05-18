package sangwon.solveit.controller.json;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonTypeName("multiChoice")
public class MultiChoiceQuestionFormJson extends QuestionFormJson {
    @NotNull
    Integer answer;
    @Size(min = 2, message = "선택지는 최소 2개 이상이여야 합니다.")
    List<String> choiceList;
}
