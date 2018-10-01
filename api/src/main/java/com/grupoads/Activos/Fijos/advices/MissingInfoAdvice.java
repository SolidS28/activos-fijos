package com.grupoads.Activos.Fijos.advices;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@Order(1)
public class MissingInfoAdvice {

	private static Logger log = LoggerFactory.getLogger(MissingInfoAdvice.class);
	
	@ResponseBody
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	List<FieldError> missingInfoHandler(MethodArgumentNotValidException ex) {
		BindingResult result = ex.getBindingResult();
		log.debug(result.toString());
		return result.getFieldErrors();
	}

}
