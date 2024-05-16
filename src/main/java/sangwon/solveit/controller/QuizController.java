package sangwon.solveit.controller;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import sangwon.solveit.service.DTO.QuizUploadParam;
import sangwon.solveit.service.QuizService;

@RestController
@RequiredArgsConstructor
public class QuizController {
    private QuizService quizService;

    @PostMapping("/quizzes")
    public String upload(@Valid @RequestBody QuizUploadParam quizUploadDto, BindingResult bindingResult) {
        String writerId = "sangwon";
        //quizUploadService.uploadQuiz(writerId, quizUploadDto);
        return "success!";
    }
}
