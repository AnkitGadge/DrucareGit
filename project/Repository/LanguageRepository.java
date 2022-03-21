package com.drucare.project.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.drucare.project.Entity.LanguageEntity;

public interface LanguageRepository extends CrudRepository<LanguageEntity,String> {

	public List<LanguageEntity> findByPersonId(String personId);

}
