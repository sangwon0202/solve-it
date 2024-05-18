package sangwon.solveit.service.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class QuizForm {
    private String title;
    private String brief;
    private List<QuestionForm> questionList;
}
