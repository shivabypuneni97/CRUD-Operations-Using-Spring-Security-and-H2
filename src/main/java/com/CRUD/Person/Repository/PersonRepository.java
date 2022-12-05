package com.CRUD.Person.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CRUD.Person.Entity.EntityClass;

public interface PersonRepository extends JpaRepository<EntityClass,Long> {


}
