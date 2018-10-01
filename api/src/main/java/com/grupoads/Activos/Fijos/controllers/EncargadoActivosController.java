package com.grupoads.Activos.Fijos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupoads.Activos.Fijos.entities.EncargadoActivo;
import com.grupoads.Activos.Fijos.exceptions.DataNotFoundException;
import com.grupoads.Activos.Fijos.repositories.EncargadoActivoRepository;

@CrossOrigin
@RestController
public class EncargadoActivosController {
	
	@Autowired
	EncargadoActivoRepository encargadoActivoRepository;
	
	/**
	 * Servicio que lista todos los encargados, es decir personas y áreas 
	 * @return lista de encargados registrados
	 */
	@GetMapping("encargado/all")
	List<EncargadoActivo> listar() {
		List<EncargadoActivo> encargados = encargadoActivoRepository.findAll();
		
		if (encargados.isEmpty()) {
			throw new DataNotFoundException();
		}
		
		return encargados;
	}
	

}
