package com.proyectoViajes.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="viajes")
public class Viaje {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="ciudad")
	private String ciudad;
	@Column(name="origen")
	private String origen;
	@Column(name="destino")
	private String destino;
	@Column(name="fecha")
	private Date fecha;
	@Column(name="precio")
	private String precio;
	
	public Viaje() {
		super();
	}

	public Viaje(int id, String ciudad, String origen, String destino, Date fecha, String precio) {
		super();
		this.id = id;
		this.ciudad = ciudad;
		this.origen = origen;
		this.destino = destino;
		this.fecha = fecha;
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}
	
	
}
