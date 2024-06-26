package sangwon.solveit.exception;

import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import sangwon.solveit.exception.client.InvalidRequestJsonException;

@RestControllerAdvice
@Slf4j
public class ExceptionHandlerAdvice {
    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ErrorResponse> handleClientException(CustomException e) {
        return ErrorResponse.toResponseEntity(e);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<ErrorResponse> handleHttpMessageNotReadableException(HttpMessageNotReadableException e) {
        return handleClientException(new InvalidRequestJsonException());
    }

    @ExceptionHandler(InvalidTypeIdException.class)
    public ResponseEntity<ErrorResponse> handleInvalidTypeIdException(InvalidTypeIdException e) {
        return ErrorResponse.toResponseEntity(new InvalidRequestJsonException());
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrorResponse> handleServerException(Exception e) {
        e.printStackTrace();
        return ErrorResponse.toResponseEntity(new ServerException());
    }
}
