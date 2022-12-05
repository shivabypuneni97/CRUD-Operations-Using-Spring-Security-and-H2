package com.CRUD.Person.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;


@Entity
public class EntityClass {
	
	  @Id

	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Long id;
	  
	    private String firstname;
	  
	    private String lastname;
		
		private String email;
		
		private String address;
		
		public EntityClass() {
		
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public EntityClass(Long id, String firstname, String lastname, String email, String address) {
			super();
			this.id = id;
			this.firstname = firstname;
			this.lastname = lastname;
			this.email = email;
			this.address = address;
		}
		
		
		
		
	
		
	}
