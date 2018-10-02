package com.dto;

import java.io.Serializable;

public class Valor implements Serializable {

	private static final long serialVersionUID = 5203344359590309326L;

	private int idValor;
	
	private String nombre;
	
	private int cantidad;
	

	public Valor() {
	}

	public Valor(int idValor, String nombre, int cantidad) {
		this.idValor = idValor;
		this.nombre = nombre;
		this.cantidad = cantidad;
	}

	public int getIdValor() {
		return idValor;
	}

	public void setIdValor(int idValor) {
		this.idValor = idValor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	

}
