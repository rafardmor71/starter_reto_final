package com.retofinal.startereureka.customereureka.reto.model;

import org.springframework.stereotype.Component;

@Component
public class Cliente {
	private Long id;
	private String nombre;
	private String apellidos;
	private String pais;
	
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public Cliente(Long id, String nombre, String apellidos, String pais) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.pais = pais;
	}
	public Cliente() {
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	

}
