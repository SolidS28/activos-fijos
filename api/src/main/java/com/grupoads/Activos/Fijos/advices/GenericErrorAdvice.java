package com.grupoads.Activos.Fijos.advices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@Order(5)
public class GenericErrorAdvice {
	
	private static Logger log = LoggerFactory.getLogger(GenericErrorAdvice.class);

	/**
	 * Capturador de exceptions genéricas
	 * @param ex - Error del sistema
	 * @return Mensaje confirmando error del sistema
	 */
	@ResponseBody
	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	String genericErrorHandler(Exception ex) {
		log.error("ERROR: ", ex);
		return "Ha ocurrido un error, por favor comuniquese con soporte para obtener más información";
	}

}
