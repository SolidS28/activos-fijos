package com.grupoads.Activos.Fijos.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.springframework.lang.NonNull;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class EncargadoActivo {

	@Id
	@GeneratedValue
	private Long id;
	
	@NonNull
	private String nombres;
	
	protected EncargadoActivo() { }
}
