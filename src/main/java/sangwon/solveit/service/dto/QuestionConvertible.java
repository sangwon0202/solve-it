package sangwon.solveit.service.dto;

import sangwon.solveit.repository.entity.Question;

public interface QuestionConvertible {
    Question toEntity(int number);
}
