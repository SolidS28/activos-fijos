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

	/**
	 * @param tipo
	 */
	public TipoActivo(String tipo) {
		super();
		this.tipo = tipo;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
