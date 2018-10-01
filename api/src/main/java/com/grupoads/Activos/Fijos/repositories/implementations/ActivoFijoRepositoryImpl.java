package com.grupoads.Activos.Fijos.repositories.implementations;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.Query;

import com.grupoads.Activos.Fijos.entities.ActivoFijo;
import com.grupoads.Activos.Fijos.repositories.customs.ActivoFijoRepositoryCustom;
import com.grupoads.Activos.Fijos.utils.TipoActivo;

public class ActivoFijoRepositoryImpl implements ActivoFijoRepositoryCustom {
	
	@PersistenceContext
	private EntityManager em;
	
//	public List<ActivoFijo> findByTipoAndFechaEntregaAndSerial(TipoActivo tipoActivo, LocalDate fechaEntrega,
//			String serial) {
//		StringBuilder sql = new StringBuilder("SELECT alto, ancho, color, descripcion, estado, fecha_baja, id, largo, nombre, numero, peso, precio_compra, serial,  FROM comunidades WHERE 1 = 1");
//		Query query = null;
//		if (!pattern.isEmpty()) {
//			sql.append(" WHERE UPPER(nombre) LIKE UPPER(:pattern)");
//			query = em.createNativeQuery(sql.toString(), Comunidad.class);
//			query.setParameter("pattern", "%" + pattern + "%");
//		} else {
//			query = em.createNativeQuery(sql.toString(), Comunidad.class);
//		}
//		options.applyPagination(query);
//		return query.getResultList();
//	}

}
