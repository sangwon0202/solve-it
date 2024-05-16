package sangwon.solveit.exception.client;


import org.springframework.http.HttpStatus;
import sangwon.solveit.exception.ClientException;

public class InvalidQuizUploadRequestException extends ClientException {
    public InvalidQuizUploadRequestException(String message) {
        super(HttpStatus.BAD_REQUEST, "E1", message);
    }
}
