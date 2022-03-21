package com.drucare.project.Repository;

import org.springframework.data.repository.CrudRepository;

import com.drucare.project.Entity.PersonEntity;

public interface PersonRepository extends CrudRepository<PersonEntity,String> {

}
