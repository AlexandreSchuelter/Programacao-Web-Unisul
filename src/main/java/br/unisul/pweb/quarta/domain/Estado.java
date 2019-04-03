package br.unisul.pweb.quarta.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
<<<<<<< HEAD
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
=======
import javax.persistence.ManyToMany;
>>>>>>> abbd5a6425a7837780ced15a560b7e48fee110a6

@Entity

public class Estado implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String nome;
	private String uf;
	
<<<<<<< HEAD
	@JsonIgnore
	@OneToMany(mappedBy="estado")
	private List<Cidade> cidades = new ArrayList<>();
	
	public Estado() {
=======
<<<<<<<< HEAD:src/main/java/br/unisul/pweb/quarta/domain/Estado.java
	public Estado() {
========
	@ManyToMany(mappedBy="categorias")
	private List<Produto> produtos = new ArrayList();
	
	public Categoria() {
>>>>>>>> abbd5a6425a7837780ced15a560b7e48fee110a6:src/main/java/br/unisul/pweb/quarta/domain/Categoria.java
>>>>>>> abbd5a6425a7837780ced15a560b7e48fee110a6
		
	}
	
	
	public Estado(Integer id, String nome, String uf) {
		super();
		this.id = id;
		this.nome = nome;
		this.uf = uf;
	}
	
<<<<<<< HEAD
=======
	
	
	public List<Produto> getProdutos() {
		return produtos;
	}


	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}


>>>>>>> abbd5a6425a7837780ced15a560b7e48fee110a6
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
<<<<<<< HEAD
	public List<Cidade> getCidades() {
		return cidades;
	}
	public void setCidades(List<Cidade> cidades) {
		this.cidades = cidades;
	}


=======

	
>>>>>>> abbd5a6425a7837780ced15a560b7e48fee110a6
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estado other = (Estado) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
<<<<<<< HEAD
=======


>>>>>>> abbd5a6425a7837780ced15a560b7e48fee110a6
	
	
	
	
	
}
