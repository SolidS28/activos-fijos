package com.grupoads.Activos.Fijos.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.grupoads.Activos.Fijos.entities.ActivoFijo;

public interface ActivoFijoRespository extends CrudRepository<ActivoFijo, Long> {

	@Override
	List<ActivoFijo> findAll();

}
