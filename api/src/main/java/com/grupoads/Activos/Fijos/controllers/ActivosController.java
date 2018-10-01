package com.grupoads.Activos.Fijos.controllers;

import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.grupoads.Activos.Fijos.entities.ActivoFijo;
import com.grupoads.Activos.Fijos.exceptions.DataNotFoundException;
import com.grupoads.Activos.Fijos.repositories.ActivoFijoRespository;
import com.grupoads.Activos.Fijos.utils.TipoActivo;

@CrossOrigin
@RestController
public class ActivosController {
	
	private static Logger log = LoggerFactory.getLogger(ActivosController.class);
	
	@Autowired
	ActivoFijoRespository activoFijoRespository;

	/**
	 * Servicio que lista todos los activos de la compañía
	 * @return lista de activos
	 * @throws DataNotFoundException - En caso de no encontrar ningún activo genera error
	 */
	@GetMapping("/activo/all")
	List<ActivoFijo> listarActivos() throws DataNotFoundException {
		log.debug("Entra al servicio");
		List<ActivoFijo> activoFijos = activoFijoRespository.findAll();
		
		if (activoFijos.isEmpty()) {
			throw new DataNotFoundException();
		}
		
		return activoFijos;
	}
	
	/**
	 * Servicio que permite la persistencia en base de datos del activo
	 * @param activo - Información valida de activo
	 * @return activo creado
	 */
	@PostMapping("/activo")
	ActivoFijo registrarActivo(@Valid @RequestBody ActivoFijo activo) {
		log.debug("Entra al servicio \"/activo\"");
		ActivoFijo respuesta = activoFijoRespository.save(activo);
		return respuesta;
	}
	
	/**
	 * Servicio que busca por fecha de tipo de activo
	 * @param tipo - Tipo de activo
	 * @return Lista de activos con tipo coincidentes
	 * @throws DataNotFoundException - en caso de no existir datos coincidentes
	 */
	@GetMapping("activo/activoPorTipo")
	List<ActivoFijo> buscarTipo(@RequestParam(value = "tipo") TipoActivo tipo) throws DataNotFoundException {
		log.debug("Entra al servicio \"activo/activoPorTipo\"");
		List<ActivoFijo> activoFijos = activoFijoRespository.findByTipo(tipo);
		
		if (activoFijos.isEmpty()) {
			throw new DataNotFoundException();
		}
		
		return activoFijos;
	}
	
	/**
	 * Servicio que busca por fecha de compra
	 * @param fechaCompra - Fecha con formato "AAAA/MM/DD" de la compra
	 * @return Lista de activos con fecha de compra coincidentes
	 * @throws DataNotFoundException - en caso de no existir datos coincidentes
	 */
	@GetMapping("activo/activoPorFechaCompra")
	List<ActivoFijo> buscarFechaCompra(@RequestParam(value = "fecha") @DateTimeFormat(iso = ISO.DATE) LocalDate fechaCompra) throws DataNotFoundException {
		log.debug("Entra al servicio \"activo/activoPorFechaCompra\"");
		List<ActivoFijo> activoFijos = activoFijoRespository.findByFechaCompra(fechaCompra);
		
		if (activoFijos.isEmpty()) {
			throw new DataNotFoundException();
		}
		
		return activoFijos;
	}
	
	/**
	 * Servicio que busca por serial los activos
	 * @param serial
	 * @return Lista de activos con seriales coincidentes
	 * @throws DataNotFoundException - en caso de no existir datos coincidentes
	 */
	@GetMapping("activo/activoPorSerial")
	List<ActivoFijo> buscar(@RequestParam(value = "serial") String serial) throws DataNotFoundException {
		log.debug("Entra al servicio \"activo/activoPorSerial\"");
		List<ActivoFijo> activoFijos = activoFijoRespository.findBySerial(serial);
		
		if (activoFijos.isEmpty()) {
			throw new DataNotFoundException();
		}
		
		return activoFijos;
	}
	
	/**
	 * Servicio que actualiza los datos del activo
	 * @param id - Id del activo a actualizar
	 * @param serial - Serial nuevo
	 * @param fechaBaja - fecha de baja nueva
	 * @return activo actualizado
	 */
	@GetMapping("activo/actualizar")
	ActivoFijo actualizarSerialFechaBaja(@RequestParam(value = "id") Long id,
			@RequestParam(value = "serial") String serial,
			@RequestParam(value = "fecha") @DateTimeFormat(iso = ISO.DATE) LocalDate fechaBaja) {
		log.debug("Entra al servicio \"activo/actualizar\"");
		
		ActivoFijo activo = activoFijoRespository.findById(id).orElseThrow(() -> new DataNotFoundException());
		activo.setFechaBaja(fechaBaja);
		activo.setSerial(serial);
		return activo;
	}
	
}
