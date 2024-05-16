package sangwon.solveit.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sangwon.solveit.repository.QuizRepository;
import sangwon.solveit.repository.UserRepository;
import sangwon.solveit.repository.entity.Quiz;
import sangwon.solveit.repository.entity.User;
import sangwon.solveit.service.DTO.QuizUploadParam;

@Service
@RequiredArgsConstructor
public class QuizService {
    private final UserRepository userRepository;
    private final QuizRepository quizRepository;

    public void uploadQuiz(String writerId, QuizUploadParam quizUploadParam) {
        User writer = userRepository.findById(writerId)
                .orElseThrow(() -> new IllegalArgumentException("유효하지 않는 사용자 아이디입니다."));
        Quiz quiz = quizUploadParam.toEntity(writer);
        quizRepository.save(quiz);
    }

}
