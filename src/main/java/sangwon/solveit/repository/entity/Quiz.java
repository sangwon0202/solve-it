package sangwon.solveit.repository.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="writer_id")
    private User writer;
    private String title;
    private String brief;
    private LocalDate uploadDate;

    @Builder
    public Quiz(User writer, String title, String brief) {
        this.writer = writer;
        this.title = title;
        this.brief = brief;
        this.uploadDate = LocalDate.now();
    }

}
