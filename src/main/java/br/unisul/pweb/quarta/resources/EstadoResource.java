package br.unisul.pweb.quarta.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

<<<<<<< HEAD
import br.unisul.pweb.quarta.domain.Cidade;
import br.unisul.pweb.quarta.domain.Estado;
import br.unisul.pweb.quarta.dtos.CidadeDTO;
import br.unisul.pweb.quarta.dtos.EstadoDTO;
import br.unisul.pweb.quarta.services.CidadeService;
import br.unisul.pweb.quarta.services.EstadoService;

@RestController
@RequestMapping(value="/estados")
=======
import br.unisul.pweb.quarta.domain.Estado;
import br.unisul.pweb.quarta.dtos.EstadoDTO;
import br.unisul.pweb.quarta.services.EstadoService;

@RestController
@RequestMapping(value="/categorias")
>>>>>>> abbd5a6425a7837780ced15a560b7e48fee110a6
public class EstadoResource {
	
	@Autowired
	private EstadoService service;
	
<<<<<<< HEAD
	@Autowired
	private CidadeService cidadeService;
	
=======
>>>>>>> abbd5a6425a7837780ced15a560b7e48fee110a6
	//BUSCAR POR ID
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<Estado> find(@PathVariable Integer id){
		Estado obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
	
	//INSERIR
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void>insert(@RequestBody Estado obj){
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().
				path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}

	//ATUALIZAR
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody Estado obj, @PathVariable Integer id){
		obj.setId(id);
		obj = service.update(obj);
		return ResponseEntity.noContent().build();
	}

	
	//EXCLUIR
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	//LISTAR TODAS
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<EstadoDTO>> findAll() {
		List<Estado> lista = service.findAll();
		//ou for para percorrer a lista
		List<EstadoDTO> listaDTO = lista.stream().map(obj -> new EstadoDTO(obj)).collect(Collectors.toList()); 
		return ResponseEntity.ok().body(listaDTO);
	}
<<<<<<< HEAD
	

	//LISTAR CIDADES DE UM ESTADO
			@RequestMapping(value="/{estadoId}/cidades", method=RequestMethod.GET)
			public ResponseEntity<List<CidadeDTO>> findCidades(@PathVariable Integer estadoId) {
				List<Cidade> list = cidadeService.findByEstado(estadoId);
				List<CidadeDTO> listDto = list.stream().map(obj -> new CidadeDTO(obj)).collect(Collectors.toList());  
				return ResponseEntity.ok().body(listDto);
			}
=======
>>>>>>> abbd5a6425a7837780ced15a560b7e48fee110a6

}