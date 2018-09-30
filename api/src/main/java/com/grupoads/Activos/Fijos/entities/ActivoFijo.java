package com.grupoads.Activos.Fijos.entities;

import java.sql.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "activos_fijos")
public class ActivoFijo {
	
	@Id
	private Long id;
	
	@NonNull
	@Column(unique = true)
	private Long numero;

	@NonNull
	private String nombre;
	
	private String descripcion;
	
	@NonNull
	private TipoActivo tipo;
	
	private String serial;
	
	private double peso;
	
	private double alto;
	
	private double ancho;
	
	private double largo;
	
	@Min(0)
	private double precioCompra;
	
	@NonNull
	@Past
	@Basic
	private Date fechaEntrega;
	
	@Basic
	private Date fechaBaja;
	
	private String color;
	
	@ManyToOne
	private EncargadoActivo encargado;
	
	protected ActivoFijo() {}

	/**
	 * @param numero
	 * @param nombre
	 * @param descripcion
	 * @param tipo
	 * @param serial
	 * @param peso
	 * @param alto
	 * @param ancho
	 * @param largo
	 * @param precioCompra
	 * @param fechaEntrega
	 * @param fechaBaja
	 * @param color
	 * @param encargado
	 */
	public ActivoFijo(Long numero, String nombre, String descripcion, TipoActivo tipo, String serial, double peso,
			double alto, double ancho, double largo, @Min(0) double precioCompra, @Past Date fechaEntrega,
			Date fechaBaja, String color, EncargadoActivo encargado) {
		super();
		this.numero = numero;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tipo = tipo;
		this.serial = serial;
		this.peso = peso;
		this.alto = alto;
		this.ancho = ancho;
		this.largo = largo;
		this.precioCompra = precioCompra;
		this.fechaEntrega = fechaEntrega;
		this.fechaBaja = fechaBaja;
		this.color = color;
		this.encargado = encargado;
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
	 * @return the numero
	 */
	public Long getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(Long numero) {
		this.numero = numero;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the tipo
	 */
	public TipoActivo getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(TipoActivo tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the serial
	 */
	public String getSerial() {
		return serial;
	}

	/**
	 * @param serial the serial to set
	 */
	public void setSerial(String serial) {
		this.serial = serial;
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * @return the alto
	 */
	public double getAlto() {
		return alto;
	}

	/**
	 * @param alto the alto to set
	 */
	public void setAlto(double alto) {
		this.alto = alto;
	}

	/**
	 * @return the ancho
	 */
	public double getAncho() {
		return ancho;
	}

	/**
	 * @param ancho the ancho to set
	 */
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	/**
	 * @return the largo
	 */
	public double getLargo() {
		return largo;
	}

	/**
	 * @param largo the largo to set
	 */
	public void setLargo(double largo) {
		this.largo = largo;
	}

	/**
	 * @return the precioCompra
	 */
	public double getPrecioCompra() {
		return precioCompra;
	}

	/**
	 * @param precioCompra the precioCompra to set
	 */
	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	/**
	 * @return the fechaEntrega
	 */
	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	/**
	 * @param fechaEntrega the fechaEntrega to set
	 */
	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	/**
	 * @return the fechaBaja
	 */
	public Date getFechaBaja() {
		return fechaBaja;
	}

	/**
	 * @param fechaBaja the fechaBaja to set
	 */
	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the encargado
	 */
	public EncargadoActivo getEncargado() {
		return encargado;
	}

	/**
	 * @param encargado the encargado to set
	 */
	public void setEncargado(EncargadoActivo encargado) {
		this.encargado = encargado;
	}
	
}
