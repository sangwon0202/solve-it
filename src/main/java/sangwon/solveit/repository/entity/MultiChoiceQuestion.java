package sangwon.solveit.repository.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Getter
@DiscriminatorValue("multiChoice")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MultiChoiceQuestion extends Question {

    private Integer answer;
    @OneToMany(mappedBy = "question", fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<Choice> choices;

    @Builder
    public MultiChoiceQuestion(Integer number, String content, Integer answer, List<Choice> choices) {
        super(number, content);
        this.answer = answer;
        this.choices = choices;
    }
}
