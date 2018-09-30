package com.grupoads.Activos.Fijos.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipos_activo")
public class TipoActivo {

	@Id
	@GeneratedValue
	private Long id;
	
	private String tipo;
	
	protected TipoActivo() { }
	
}
