package sangwon.solveit.controller.request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import sangwon.solveit.controller.form.QuestionForm;

import java.util.List;


@Getter
@Setter
public class QuizUploadRequest {
    @NotBlank(message = "퀴즈 제목을 입력해주세요.")
    @Size(max = 50, message = "퀴즈 제목은 50자 이하여야 합니다.")
    private String title;
    @NotBlank(message = "퀴즈에 대한 간단한 설명을 입력해주세요.")
    @Size(max = 100, message = "퀴즈 설명은 100자 이하여야 합니다.")
    private String brief;
    @NotEmpty(message = "퀴즈의 문항은 최소 1개 이상이어야 합니다.")
    private List<QuestionForm> questionList;
}

