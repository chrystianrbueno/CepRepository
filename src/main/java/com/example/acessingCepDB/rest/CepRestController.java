package com.example.acessingCepDB.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.acessingCepDB.entity.CepEntity;
import com.example.acessingCepDB.repository.CepRepository;
/**
 * 
 * @author Chrystian Rocha
 *
 */
@RestController
@RequestMapping("api/cep/")
public class CepRestController {

	@Autowired
	CepRepository repository;

	/**
	 * 
	 * @return a list of CepEntity
	 */
	@GetMapping("/")
	public Iterable<CepEntity> getAll() {
		return repository.findAll();
	}
	
	/**
	 * 
	 * @param id
	 * @return a CepEntity by its id
	 */
	@GetMapping("/{id}")
	public Optional<CepEntity> getById(@PathVariable Long id){
		return repository.findById(id);
	}

	/**
	 * 
	 * @param id
	 * delete a CepEntity by its id
	 */
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable Long id){
		repository.deleteById(id);
	}
	
	/**
	 * 
	 * @param cep
	 * @return a CepEntity
	 * add a new CepEntity using Json
	 */
	@PostMapping("/add")
	public CepEntity addNewCep(@RequestBody CepEntity cep) {
		return repository.save(cep);
	}
}
