package sangwon.solveit.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.ResponseEntity;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class ErrorResponse {
    private String errorCode;
    private String message;

    public static ResponseEntity<ErrorResponse> toResponseEntity(ClientException e) {
        return ResponseEntity
                .status(e.getHttpStatus())
                .body(ErrorResponse.builder()
                        .errorCode(e.getErrorCode())
                        .message(e.getMessage())
                        .build()
                );
    }
}