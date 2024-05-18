package sangwon.solveit.exception.client;


import org.springframework.http.HttpStatus;
import sangwon.solveit.exception.CustomException;

public class InvalidQuizFormException extends CustomException {
    public InvalidQuizFormException(String message) {
        super(HttpStatus.BAD_REQUEST, "E1", message);
    }
}
