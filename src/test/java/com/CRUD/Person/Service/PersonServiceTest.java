package com.CRUD.Person.Service;

import com.CRUD.Person.Entity.EntityClass;
import com.CRUD.Person.Repository.PersonRepository;
import com.CRUD.Person.Service.Impl.PersonServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonServiceTest {

    @InjectMocks
    private PersonServiceImpl personService;

    @Mock
    private PersonRepository personRepository;

    @Test
    public void testAddPerson() throws Exception{
        EntityClass entityClass = new EntityClass(1L,"shiva","krishna","sivakrishna@gmail.com","Leicester,UK", 7894561230L);
        when(personRepository.save(any())).thenReturn(entityClass);
        EntityClass createdPerson = personService.createPerson(entityClass);
        assertEquals("shiva", createdPerson.getFirstname());
    }
    @Test
    public void testGetPersonById() throws Exception{
        EntityClass entityClass = new EntityClass(1L,"shiva","krishna","sivakrishna@gmail.com","Leicester,UK", 7894561230L);
        when(personRepository.findById(any())).thenReturn(Optional.of(entityClass));
        EntityClass returnedPerson = personService.getPersonById(1L);
        assertEquals("shiva", returnedPerson.getFirstname());
    }

    @Test
    public void testGetAllPersons() throws Exception{
        List<EntityClass> entityClassList = new ArrayList<>();
        EntityClass entityClass = new EntityClass(1L,"shiva","krishna","sivakrishna@gmail.com","Leicester,UK", 7894561230L);
        entityClassList.add(entityClass);
        when(personRepository.findAll()).thenReturn(entityClassList);
        List<EntityClass> returnedPerson = personService.getAllPersons();
        assertEquals("shiva", returnedPerson.get(0).getFirstname());
    }

    @Test
    public void testUpdateEntityClass() throws Exception{
        EntityClass entityClass = new EntityClass(1L,"shiva","krishna","sivakrishna@gmail.com","Leicester,UK", 7894561230L);
        when(personRepository.save(any())).thenReturn(entityClass);
        EntityClass returnedPerson = personService.updateEntityClass(entityClass);
        assertEquals("shiva", returnedPerson.getFirstname());
    }

    @Test
    public void testDeletePersonById() throws Exception{
        EntityClass entityClass = new EntityClass(1L,"shiva","krishna","sivakrishna@gmail.com","Leicester,UK", 7894561230L);
        personService.deletePersonById(1L);
        verify(personRepository,times(1)).deleteById(1L);
    }

}
