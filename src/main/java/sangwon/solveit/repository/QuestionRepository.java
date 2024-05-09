package sangwon.solveit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sangwon.solveit.repository.entity.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}
