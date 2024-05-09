package sangwon.solveit.repository.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import sangwon.solveit.type.QuestionType;


@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Question {
    @Id
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;
    private Long number;
    private String content;
    @Enumerated(EnumType.STRING)
    private QuestionType questionType;
    private String answer;

    @Builder
    public Question(Quiz quiz, Long number, String content, QuestionType questionType, String answer) {
        this.quiz = quiz;
        this.number = number;
        this.content = content;
        this.questionType = questionType;
        this.answer = answer;
    }
}
