package com.drucare.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.drucare.Entity.PersonEntity;
import com.drucare.Service.PersonService;


@RestController
public class PersonController {
	@Autowired
	 PersonService personService;

	@RequestMapping("/persons")
	public List<PersonEntity> getallThePersons() {
		return personService.getAllPersons();
	}

	@RequestMapping("/persons/{id}")
	public PersonEntity getPerson(@PathVariable String id) {
		return personService.getPerson(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/persons")
	public void addPerson(@RequestBody PersonEntity personEntity) {
		personService.addPerson(personEntity);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/persons/{id}") 
	public void updatePerson(@RequestBody PersonEntity person,@PathVariable String id) {
		personService.updatePerson(id,person);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/persons/{id}")
	public void deletePerson(@PathVariable String id) {
		personService.deletePerson(id);
	}
}