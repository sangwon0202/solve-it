package sangwon.solveit.exception;

import org.springframework.http.HttpStatus;

public class ServerException extends CustomException {
    public ServerException() {
        super(HttpStatus.INTERNAL_SERVER_ERROR, "S1", "서버 내부에 문제가 발생하였습니다. 잠시 후 다시 시도해주세요.");
    }
}
