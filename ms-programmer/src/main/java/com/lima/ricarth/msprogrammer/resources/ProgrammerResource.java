package com.lima.ricarth.msprogrammer.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lima.ricarth.msprogrammer.entities.Programmer;
import com.lima.ricarth.msprogrammer.repositories.ProgrammerRepository;

@RestController
@RequestMapping(value = "/programmers")
public class ProgrammerResource {
	
	@Autowired
	private ProgrammerRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Programmer>> findAll(){
		List<Programmer> list = repository.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Programmer> getById(@PathVariable Long id){
		Programmer prog = repository.findById(id).get();
		return ResponseEntity.ok(prog);
	}
}
