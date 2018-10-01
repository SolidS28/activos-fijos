package com.grupoads.Activos.Fijos.advices;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.grupoads.Activos.Fijos.exceptions.DataNotFoundException;

/**
 * @author nvivasbe Clase que redirige exceptions de DataNotFound a status 404
 */
@ControllerAdvice
public class DataNotFoundAdvice {

	@ResponseBody
	@ExceptionHandler(DataNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String dataNotFoundHandler(DataNotFoundException ex) {
		return "No existen datos correspondientes a los críterios de búsqueda";
	}

}
