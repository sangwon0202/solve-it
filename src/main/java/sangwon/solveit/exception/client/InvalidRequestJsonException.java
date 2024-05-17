package sangwon.solveit.exception.client;

import org.springframework.http.HttpStatus;
import sangwon.solveit.exception.ClientException;

public class InvalidRequestJsonException extends ClientException {
    public InvalidRequestJsonException() {
        super(HttpStatus.BAD_REQUEST, "J1", "요청 JSON 값이 잘못되었습니다.");
    }
}
