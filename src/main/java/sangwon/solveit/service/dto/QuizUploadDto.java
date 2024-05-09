package sangwon.solveit.service.dto;

import lombok.Data;
import sangwon.solveit.repository.entity.Question;
import sangwon.solveit.repository.entity.Quiz;
import sangwon.solveit.repository.entity.User;

import java.util.List;

@Data
public class QuizUploadDto {
    private String title;
    private String brief;
    private List<QuestionUploadDto> questionList;

    public Quiz toEntity(User writer) {
        return Quiz.builder()
                .writer(writer)
                .title(title)
                .brief(brief)
                .build();
    }
}
