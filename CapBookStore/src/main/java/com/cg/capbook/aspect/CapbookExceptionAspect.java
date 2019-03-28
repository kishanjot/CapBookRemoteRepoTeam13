package com.cg.capbook.aspect;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import com.cg.capbook.exceptions.EmailAlreadyExistsException;
import com.cg.capbook.exceptions.InvalidEmailIdException;
import com.cg.capbook.exceptions.InvalidPasswordException;
import com.cg.capbook.exceptions.NoUserFoundException;
import com.cg.capbook.exceptions.RequestAlreadySentException;

@ControllerAdvice
public class CapbookExceptionAspect {

	@ExceptionHandler(NoUserFoundException.class)
	public ModelAndView handleNoUserFoundException(Exception e) {
		return new ModelAndView("indexPage","errorMessage",e.getMessage());
	}

	@ExceptionHandler(EmailAlreadyExistsException.class)
	public ModelAndView handleEmailAlreadyRegisteredException(Exception e) {
		return new ModelAndView("indexPage", "errorMessage", e.getMessage());
	}

	@ExceptionHandler(InvalidEmailIdException.class)
	public ModelAndView handleInvalidEmailIdException(Exception e) {
		return new ModelAndView("indexPage", "errorMessage", e.getMessage());
	}

	@ExceptionHandler(InvalidPasswordException.class)
	public ModelAndView handleInvalidPasswordException(Exception e) {
		return new ModelAndView("indexPage", "errorMessage", e.getMessage());
	}

	@ExceptionHandler(RequestAlreadySentException.class)
	public ModelAndView handleRequestAlreadySentException(Exception e) {
		return new ModelAndView("indexPage", "errorMessage", e.getMessage());
	}    
}