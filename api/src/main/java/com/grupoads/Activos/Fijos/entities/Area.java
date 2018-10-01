package com.grupoads.Activos.Fijos.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "areas")
public class Area extends EncargadoActivo {
	
	@ManyToOne
	@NonNull
	private Ciudad ciudad;
	
	protected Area() { }
	
	public Area(String nombres, Ciudad ciudad) {
		this.nombres = nombres;
		this.ciudad = ciudad;
	}

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
