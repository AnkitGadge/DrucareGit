package com.drucare.Repository;


import org.springframework.data.repository.CrudRepository;

import com.drucare.Entity.PersonEntity;


public interface PersonRepository extends CrudRepository<PersonEntity,String> {

}
