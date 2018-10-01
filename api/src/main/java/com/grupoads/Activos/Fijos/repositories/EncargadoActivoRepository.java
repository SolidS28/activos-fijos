package com.grupoads.Activos.Fijos.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.grupoads.Activos.Fijos.entities.EncargadoActivo;

public interface EncargadoActivoRepository extends CrudRepository<EncargadoActivo, Long> {
	
	/**
	 * Consulta que lista todos los elementos de la tabla
	 */
	@Override
	List<EncargadoActivo> findAll();
}
