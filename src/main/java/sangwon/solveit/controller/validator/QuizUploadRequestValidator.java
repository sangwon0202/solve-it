package sangwon.solveit.controller.validator;

import sangwon.solveit.controller.DTO.QuizUploadRequest;
import sangwon.solveit.exception.client.InvalidQuizUploadRequestException;


public class QuizUploadRequestValidator {

    public void validate(QuizUploadRequest quizUploadRequest) {
        quizUploadRequest.getQuestionList().forEach( questionInfo -> {

            switch (questionInfo.getQuestionType()) {
                case SHORT_ANSWER, OX -> {
                    if (questionInfo.getChoiceList() != null && questionInfo.getChoiceList().size() > 0)
                        throw new InvalidQuizUploadRequestException("주관식과 OX 문제는 선택지를 가질 수 없습니다.");
                }
                case MULTI_CHOICE -> {
                    if (questionInfo.getChoiceList() == null || questionInfo.getChoiceList().size() < 2)
                        throw new InvalidQuizUploadRequestException("객관식 문제는 선택지를 2개 이상 가져야 합니다.");
                }
            }

        });
    }

}
