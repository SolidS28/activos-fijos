package com.grupoads.Activos.Fijos.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.grupoads.Activos.Fijos.entities.ActivoFijo;
import com.grupoads.Activos.Fijos.exceptions.DataNotFoundException;
import com.grupoads.Activos.Fijos.repositories.ActivoFijoRespository;

@CrossOrigin
@RestController
public class ActivosController {
	
	@Autowired
	ActivoFijoRespository activoFijoRespository;

	@GetMapping("/activo/all")
	List<ActivoFijo> listarActivos() throws DataNotFoundException {
		List<ActivoFijo> activoFijos = activoFijoRespository.findAll();
		
		if (activoFijos.isEmpty()) {
			throw new DataNotFoundException();
		}
		
		return activoFijos;
	}
	
	@PostMapping("/activo")
	ActivoFijo registrarActivo(@Valid @RequestBody ActivoFijo activo) {
		ActivoFijo respuesta = activoFijoRespository.save(activo);
		return respuesta;
	}
}
