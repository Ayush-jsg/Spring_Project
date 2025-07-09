package in.ashokit.exception;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {

	@ExceptionHandler(value = UserNotFoundException.class)
	public ResponseEntity<ErrorInfo> handleUserNFE(UserNotFoundException e) {

		String exmsg = e.getMessage();

		ErrorInfo info = new ErrorInfo();
		info.setCode("SBIEX0001");
		info.setMsg(exmsg);
		info.setWhen(LocalDate.now());

		return new ResponseEntity<>(info, HttpStatus.BAD_REQUEST);

	}

	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ErrorInfo> handlerException(Exception e) {

		String exmsg = e.getMessage();

		ErrorInfo info = new ErrorInfo();
		info.setCode("SBIEX0003");
		info.setMsg(exmsg);
		info.setWhen(LocalDate.now());

		return new ResponseEntity<>(info, HttpStatus.INTERNAL_SERVER_ERROR);

	}

}
