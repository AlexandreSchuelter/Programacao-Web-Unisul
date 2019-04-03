package br.unisul.pweb.quarta.repositories;

<<<<<<< HEAD
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.unisul.pweb.quarta.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{
	
	@Transactional(readOnly=true)
	public List<Estado> findAllByOrderByNome();

}
=======
import org.springframework.data.jpa.repository.JpaRepository;

import br.unisul.pweb.quarta.domain.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Integer>{

}
>>>>>>> abbd5a6425a7837780ced15a560b7e48fee110a6
