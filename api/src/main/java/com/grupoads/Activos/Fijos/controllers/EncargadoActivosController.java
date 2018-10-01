package com.grupoads.Activos.Fijos.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.grupoads.Activos.Fijos.advices.GenericErrorAdvice;
import com.grupoads.Activos.Fijos.entities.EncargadoActivo;
import com.grupoads.Activos.Fijos.exceptions.DataNotFoundException;
import com.grupoads.Activos.Fijos.repositories.EncargadoActivoRepository;

@CrossOrigin
@RestController
public class EncargadoActivosController {
	
	private static final String SECURITY_TOKEN = "Basic QWxhZGRpbjpPcGVuU2VzYW1l";


	private static Logger log = LoggerFactory.getLogger(EncargadoActivosController.class);

	
	@Autowired
	EncargadoActivoRepository encargadoActivoRepository;
	
	/**
	 * Servicio que lista todos los encargados, es decir personas y áreas 
	 * @return lista de encargados registrados
	 * @throws Exception - error en authenticación
	 */
	@GetMapping("encargado/all")
	List<EncargadoActivo> listar(@RequestHeader("Authorization") String token) throws Exception {
		if (token.isEmpty() || !token.equals(SECURITY_TOKEN)) {
			throw new Exception("ERROR DE AUTENCICACION");
		}
		log.debug("Entra al servicio \"encargado/all\"");
		List<EncargadoActivo> encargados = encargadoActivoRepository.findAll();
		
		if (encargados.isEmpty()) {
			throw new DataNotFoundException();
		}
		
		return encargados;
	}
	

}
