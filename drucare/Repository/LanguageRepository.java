package com.drucare.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.drucare.Entity.LanguageEntity;

public interface LanguageRepository extends CrudRepository<LanguageEntity, String> {
	public List<LanguageEntity> findByHelloId(String personId);
}
