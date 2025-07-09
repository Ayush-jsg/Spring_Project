package in.ashokit.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import in.ashokit.controller.DemoController;

@ControllerAdvice
public class AppExceptionHandler {

	private Logger logger = LoggerFactory.getLogger(DemoController.class);

	@ExceptionHandler(value = Exception.class)
	public String handleAE(Exception ae) {
		String msg = ae.getMessage();
		logger.error(msg);
		return "errorpage";

	}

}
