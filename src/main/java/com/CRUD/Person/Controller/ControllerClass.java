package com.CRUD.Person.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.CRUD.Person.Entity.EntityClass;
import com.CRUD.Person.Service.PersonService;



@RestController
public class ControllerClass {
	
	@Autowired
	private PersonService personService;
	
	
	@PostMapping("/addPerson")
	public EntityClass addPerson(@RequestBody EntityClass ec) {

		return personService.createPerson(ec) ;
	}
	
	@GetMapping("/getPersonById/{id}")
	public EntityClass getPersonById(@PathVariable Long id) {
	
		return personService.getPersonById(id);
	}
	
	
	@GetMapping("/persons")
	public List<EntityClass> getAllPersons() {
		
		return personService.getAllPersons();
	}
	
	
	@PutMapping("/updatePerson")
	public  EntityClass updatePerson(@RequestBody EntityClass Uec) {

		return personService.updateEntityClass(Uec);
     	    }
	
	@DeleteMapping("/deletePersonById/{id}")
	public String deletePersonById(@PathVariable Long id) {
		
		return personService.deletePersonById(id);
	}
	
}
