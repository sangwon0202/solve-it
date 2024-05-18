package sangwon.solveit.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sangwon.solveit.repository.QuizRepository;
import sangwon.solveit.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class QuizService {
    private final UserRepository userRepository;
    private final QuizRepository quizRepository;


}
