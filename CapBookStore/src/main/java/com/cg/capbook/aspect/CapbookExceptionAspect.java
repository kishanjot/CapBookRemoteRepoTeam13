package com.cg.capbook.aspect;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import com.cg.capbook.exceptions.NoUserFoundException;

@ControllerAdvice
public class CapbookExceptionAspect {
	
	@ExceptionHandler(NoUserFoundException.class)
	public ModelAndView handelNoUserFoundException(Exception e) {
		return new ModelAndView("findUserPage","errorMessage",e.getMessage());
	}
}