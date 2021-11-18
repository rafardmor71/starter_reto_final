package com.retofinal.starter.customereureka.configuration;

import java.util.ArrayList;
import java.util.List;

import com.retofinal.startereureka.customereureka.reto.model.Cliente;
import com.retofinal.startereureka.customereureka.reto.model.ClienteBuilder;

public class ListaClientes {
	private List<Cliente> listaClientes = new ArrayList<>();
	private String pais;
	
	
	public ListaClientes(String pais) {
		this.pais = pais;
	}
	
	
	public List<Cliente> crearClientesSegunPais() {
		switch (pais) {
		case "Spain":
			ClienteBuilder clbE = new ClienteBuilder();
			Cliente cl1 = clbE.withId(1L).withNombre("Pepe").withApellidos("Gutierrez Beltrán").withPais(pais).build();
			Cliente cl2 = clbE.withId(2L).withNombre("Lucas").withApellidos("Beltrán Torres").withPais(pais).build();
			Cliente cl3 = clbE.withId(3L).withNombre("Marco").withApellidos("Alonso Beltrán").withPais(pais).build();
			Cliente cl4 = clbE.withId(4L).withNombre("Pilar").withApellidos("Medina Galan").withPais(pais).build();
			listaClientes.add(cl1);
			listaClientes.add(cl2);
			listaClientes.add(cl3);
			listaClientes.add(cl4);
			break;
			
		case "France":
			ClienteBuilder clbF = new ClienteBuilder();
			Cliente cl1F = clbF.withId(1L).withNombre("Pepe").withApellidos("Gutierrez Beltrán").withPais(pais).build();
			Cliente cl2F = clbF.withId(2L).withNombre("Lucas").withApellidos("Beltrán Torres").withPais(pais).build();
			Cliente cl3F = clbF.withId(3L).withNombre("Marco").withApellidos("Alonso Beltrán").withPais(pais).build();
			Cliente cl4F = clbF.withId(4L).withNombre("Pilar").withApellidos("Medina Galan").withPais(pais).build();
			listaClientes.add(cl1F);
			listaClientes.add(cl2F);
			listaClientes.add(cl3F);
			listaClientes.add(cl4F);
			break;
		
		default:
			ClienteBuilder clbU = new ClienteBuilder();
			Cliente cl1U = clbU.withId(1L).withNombre("Pepe").withApellidos("Gutierrez Beltrán").withPais("UNKNOW").build();
			Cliente cl2U = clbU.withId(2L).withNombre("Lucas").withApellidos("Beltrán Torres").withPais("UNKNOW").build();
			Cliente cl3U = clbU.withId(3L).withNombre("Marco").withApellidos("Alonso Beltrán").withPais("UNKNOW").build();
			Cliente cl4U = clbU.withId(4L).withNombre("Pilar").withApellidos("Medina Galan").withPais("UNKNOW").build();
			listaClientes.add(cl1U);
			listaClientes.add(cl2U);
			listaClientes.add(cl3U);
			listaClientes.add(cl4U);
			break;
		}
		
		return listaClientes;
	}
	

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}
	

}
