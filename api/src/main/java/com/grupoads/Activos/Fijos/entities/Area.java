package com.grupoads.Activos.Fijos.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.springframework.lang.NonNull;

@Entity
public class Area extends EncargadoActivo {
	
	@ManyToOne
	@NonNull
	private Ciudad ciudad;
	
	protected Area() { }

	/**
	 * @return the ciudad
	 */
	public Ciudad getCiudad() {
		return ciudad;
	}

	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}
}
