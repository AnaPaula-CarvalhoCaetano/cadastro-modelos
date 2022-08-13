package com.cadastro.modelos.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadastro.modelos.models.Modelos;
import com.cadastro.modelos.repository.ModelosRepository;

@RestController
@RequestMapping(value = "/api")

public class ModelosResource {
	
	@Autowired
	ModelosRepository modelosRepository;
	
	@GetMapping("/modelos")
	public List<Modelos> listaModelos(){
		return modelosRepository.findAll();
	
	}
	
	@GetMapping("/modelos/{id}")
	public Modelos listaModelosUnico(@PathVariable(value="id") long id) {
		return modelosRepository.findById(id);
	}
	
	@PostMapping("/modelos")
	public Modelos salvaModelos(@RequestBody Modelos modelos) {
		return modelosRepository.save(modelos);
		
	}
	
	@DeleteMapping("/modelos")
	public void deletaModelos(@RequestBody Modelos modelos) {
		modelosRepository.delete(modelos);
	}
	
	@PutMapping("/modelos")
	public Modelos atualizaModelos(@RequestBody Modelos modelos) {
		return modelosRepository.save(modelos);
	}

}
