package sangwon.solveit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sangwon.solveit.repository.entity.Choice;

@Repository
public interface ChoiceRepository extends JpaRepository<Choice, Long> {
}
