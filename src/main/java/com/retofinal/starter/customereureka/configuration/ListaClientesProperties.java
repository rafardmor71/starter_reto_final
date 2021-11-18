package com.retofinal.starter.customereureka.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("cliente")
public class ListaClientesProperties {
	
	private String pais = "España";

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
}
