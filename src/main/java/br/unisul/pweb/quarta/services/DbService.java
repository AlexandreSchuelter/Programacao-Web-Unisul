package br.unisul.pweb.quarta.services;

import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unisul.pweb.quarta.domain.Estado;
import br.unisul.pweb.quarta.repositories.EstadoRepository;

@Service
public class DbService {
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	public void inicializaBancoDeDados() throws ParseException {
		
		Estado cat1 = new Estado(null, "Santa Catarina","SC");
		Estado cat2 = new Estado(null, "Parana","PR");
		Estado cat3 = new Estado(null, "Sao Paulo","SP");
		Estado cat4 = new Estado(null, "Rio Grande do Sul","RS");
		Estado cat5 = new Estado(null, "Minas Gerais","MG");
		Estado cat6 = new Estado(null, "Mato Grosso do Sul","MS");
		Estado cat7 = new Estado(null, "Bahia","BA");
		estadoRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6, cat7));
		
	}


}
