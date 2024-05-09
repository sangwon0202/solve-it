package sangwon.solveit.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sangwon.solveit.repository.UserRepository;
import sangwon.solveit.repository.entity.User;
import sangwon.solveit.service.dto.QuizUploadDto;

@Service
@RequiredArgsConstructor
public class QuizService {
    private final UserRepository userRepository;

    // quizUploadDto 벨리데이션되었다고 가정
    void uploadQuiz(String writerId, QuizUploadDto quizUploadDto) {
        User writer = userRepository.findById(writerId).orElseThrow();
    }
}
