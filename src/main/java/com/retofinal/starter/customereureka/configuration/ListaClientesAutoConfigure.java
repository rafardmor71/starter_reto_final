package com.retofinal.starter.customereureka.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;





@Configuration
@ConditionalOnClass(ListaClientes.class)
@EnableConfigurationProperties(ListaClientesProperties.class)
public class ListaClientesAutoConfigure {

	private final ListaClientesProperties properties;
	
	
	
	public ListaClientesAutoConfigure(ListaClientesProperties properties) {
		this.properties = properties;
	}



	@Bean
	public ListaClientes saludo() {
		System.out.println("Pais: "+properties.getPais());
		return new ListaClientes(properties.getPais());
	}
}
