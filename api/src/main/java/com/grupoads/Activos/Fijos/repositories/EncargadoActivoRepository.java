package com.grupoads.Activos.Fijos.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.grupoads.Activos.Fijos.entities.EncargadoActivo;

public interface EncargadoActivoRepository extends CrudRepository<EncargadoActivo, Long> {
	
	@Override
	List<EncargadoActivo> findAll();
}
