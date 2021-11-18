package com.retofinal.startereureka.customereureka.reto.model;

public class ClienteBuilder implements IBuilder {

	private Long id;
	private String nombre;
	private String apellidos;
	private String pais;

	public ClienteBuilder() {
		
	}
	public ClienteBuilder withId(Long id) {
		this.id = id;
		return this;
	}
	public ClienteBuilder withNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}

	public ClienteBuilder withApellidos(String apellidos) {
		this.apellidos = apellidos;
		return this;
	}

	public ClienteBuilder withPais(String pais) {
		this.pais = pais;
		return this;
	}

	@Override
	public Cliente build() {
		Cliente cliente = new Cliente();
		cliente.setId(this.id);
		cliente.setNombre(this.nombre);
		cliente.setApellidos(this.apellidos);
		cliente.setPais(pais);
		return cliente;
	}

}
