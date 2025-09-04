package IntegracionBackFront.backfront.Exceptions.Users;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class ExceptionTipoUsuarioNotFounfd extends RuntimeException {
    public ExceptionTipoUsuarioNotFounfd(String message) {
        super(message);
    }
}
