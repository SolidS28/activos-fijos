package com.grupoads.Activos.Fijos.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.grupoads.Activos.Fijos.entities.ActivoFijo;
import com.grupoads.Activos.Fijos.utils.TipoActivo;

public interface ActivoFijoRespository extends CrudRepository<ActivoFijo, Long> {

	/**
	 * Consulta de todos los elementos de la tabla
	 */
	@Override
	List<ActivoFijo> findAll();
	
	/**
	 * Consulta de los elementos que corresponden al tipo
	 * @param tipo - tipo del activo a buscar
	 * @return lista de activos correspondientes al criterio de búsqueda
	 */
	List<ActivoFijo> findByTipo(TipoActivo tipo);
	
	/**
	 * Consulta de los elementos que corresponden a la fecha de compra
	 * @param fechaCompra - fecha de compra del activo a buscar
	 * @return lista de activos correspondientes al criterio de búsqueda
	 */
	List<ActivoFijo> findByFechaCompra(LocalDate fechaCompra);
	
	/**
	 * Consulta de los elementos que corresponden al serial
	 * @param serial - serial del activo a buscar
	 * @return lista de activos correspondientes al criterio de búsqueda
	 */
	List<ActivoFijo> findBySerial(String serial);
}
