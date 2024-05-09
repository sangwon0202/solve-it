package sangwon.solveit.service.dto;

import lombok.Data;
import sangwon.solveit.repository.entity.Choice;
import sangwon.solveit.repository.entity.Question;

@Data
public class ChoiceUploadDto {
    private Long number;
    private String content;
    public Choice toEntity(Question question) {
        return Choice.builder()
                .question(question)
                .number(number)
                .content(content)
                .build();
    }
}
