package com.grupoads.Activos.Fijos.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.NotNull;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class EncargadoActivo {

	@Id
	@GeneratedValue
	protected Long id;

	@NotNull
	protected String nombres;

	protected EncargadoActivo() {
	}

	/**
	 * Constructor de la entidad
	 * @param nombres
	 */
	public EncargadoActivo(String nombres) {
		super();
		this.nombres = nombres;
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
	 * @return the nombres
	 */
	public String getNombres() {
		return nombres;
	}

	/**
	 * @param nombres the nombres to set
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
}
