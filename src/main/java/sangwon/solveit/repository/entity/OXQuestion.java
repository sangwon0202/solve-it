package sangwon.solveit.repository.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@DiscriminatorValue("OX")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class OXQuestion extends Question {
    private Boolean answer;

    @Builder
    public OXQuestion(Integer number, String content, Boolean answer) {
        super(number, content);
        this.answer = answer;
    }

}
