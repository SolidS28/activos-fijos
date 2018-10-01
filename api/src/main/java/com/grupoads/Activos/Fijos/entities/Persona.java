package com.grupoads.Activos.Fijos.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "personas")
public class Persona extends EncargadoActivo {
	
	@NotNull
	private String apellidos;
	
	@Column(unique = true)
	private String identificacion;
	
	protected Persona() { }

	public Persona(String nombres, String apellidos, String identificacion) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.identificacion = identificacion;
	}
	
	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the identificacion
	 */
	public String getIdentificacion() {
		return identificacion;
	}

	/**
	 * @param identificacion the identificacion to set
	 */
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
}
