package com.CRUD.Person.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRUD.Person.Entity.EntityClass;
import com.CRUD.Person.Repository.PersonRepository;
import com.CRUD.Person.Service.PersonService;


@Service
public class PersonServiceImpl implements PersonService{

     @Autowired	
	private PersonRepository personRepository;
     
     
     
	 public EntityClass getPersonById(Long id) {
		
		return personRepository.findById(id).get();
		
	 }
	 
	 
	   public List<EntityClass> getAllPersons() {


		return personRepository.findAll();
	}


	public EntityClass createPerson(EntityClass ec) {
		// TODO Auto-generated method stub
		return personRepository.save(ec);
	}


	public EntityClass updateEntityClass(EntityClass Uec) {
		
		 return personRepository.save(Uec);
	}


	public String deletePersonById(Long id) {
		personRepository.deleteById(id);
		return "person got deleted";
	}

	
		
}
	
	
     
  

