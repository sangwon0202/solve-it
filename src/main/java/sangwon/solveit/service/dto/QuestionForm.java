package sangwon.solveit.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import sangwon.solveit.repository.entity.Question;

@Getter
@Setter
@AllArgsConstructor
public abstract class QuestionForm {

    abstract public Question toEntity(int number);
}
