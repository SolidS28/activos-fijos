package com.grupoads.Activos.Fijos.advices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
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
@Order(4)
public class DataNotFoundAdvice {
	
	private static Logger log = LoggerFactory.getLogger(DataNotFoundException.class);

	/**
	 * Capturador de exceptions por no encontrar datos que satisfagan las consultas
	 * @param ex - Error de data no encontrada
	 * @return Mensaje informando la falta de coincidencias
	 */
	@ResponseBody
	@ExceptionHandler(DataNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String dataNotFoundHandler(DataNotFoundException ex) {
		log.debug("No se encuentran datos: ", ex);
		return "No existen datos correspondientes a los críterios de búsqueda";
	}

}
