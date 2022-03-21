package com.drucare.project.Service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.drucare.project.Entity.PersonEntity;
import com.drucare.project.Repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	 PersonRepository personRepository;

	public List<PersonEntity> getAllPersons() {
		List<PersonEntity> personname = new ArrayList<>();

		personRepository.findAll().forEach(personname::add);
		return personname;
//	return	(List<PersonEntity>) personRepository.findAll();
	}

	public PersonEntity getPerson(String id) {
		return personRepository.findById(id).get();
	}

	public void addPerson(PersonEntity personEntity) {

		personRepository.save(personEntity);
	}

	public void updatePerson(String id, PersonEntity person) {
		// TODO Auto-generated method stub
		personRepository.save(person);

	}

	public void deletePerson(String id) {
		// TODO Auto-generated method stub
		personRepository.deleteById(id);
	}

}
