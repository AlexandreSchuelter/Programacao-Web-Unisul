package br.unisul.pweb.quarta.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.unisul.pweb.quarta.services.DbService;

@Configuration
public class DevConfig {
	
	@Autowired
	private DbService dbService;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String strategy;
	
	// no lugar da linha 24
	@Bean
	public boolean inicializaBancoDeDados() throws ParseException {
		if (!strategy.equals("create")) /* !"create".equals(strategy) */{
			return false;
		}
		dbService.inicializaBancoDeDados();
		return true;
	}

}