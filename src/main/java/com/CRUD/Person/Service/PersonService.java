package com.CRUD.Person.Service;

import java.util.List;

import com.CRUD.Person.Entity.EntityClass;



public interface PersonService {
     
	
	//List<EntityClass> createPersons(List<EntityClass> ec);
	
	EntityClass  createPerson(EntityClass ec);
	
	List<EntityClass> getAllPersons();
	
	EntityClass  getPersonById(Long  id);
	
	EntityClass  updateEntityClass(EntityClass Uec);
	
	String deletePersonById(Long id);
	 
	//tityClass savePerson(EntityClass s);
	

	
	
	
	
//	void deleteEntityClassByEmail(String Email);


}
