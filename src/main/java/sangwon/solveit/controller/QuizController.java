package sangwon.solveit.controller;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import sangwon.solveit.controller.request.QuizUploadRequest;
import sangwon.solveit.exception.client.InvalidQuizUploadRequestException;
import sangwon.solveit.service.QuizService;

@RestController
@RequiredArgsConstructor
public class QuizController {
    private QuizService quizService;

    @PostMapping("/api/quizzes")
    public String upload(@Valid @RequestBody QuizUploadRequest quizUploadRequest,
                         BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            String message = bindingResult.getAllErrors().get(0).getDefaultMessage();
            throw new InvalidQuizUploadRequestException(message);
        }
        //quizUploadService.uploadQuiz(writerId, quizUploadDto);
        return "success!";
    }
}
