package sangwon.solveit.repository.entity;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@DiscriminatorValue("shortAnswer")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ShortAnswerQuestion extends Question {
    private String answer;

    public ShortAnswerQuestion(Integer number, String content, String answer) {
        super(number, content);
        this.answer = answer;
    }
}
