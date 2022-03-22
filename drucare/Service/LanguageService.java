package com.drucare.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drucare.Entity.LanguageEntity;
import com.drucare.Repository.LanguageRepository;

@Service
public class LanguageService {

	@Autowired
	private LanguageRepository languageRepository;

	public List<LanguageEntity> getAllTheLanguages(String personId) {

		List<LanguageEntity> languagelist = new ArrayList<>();
		languageRepository.findByHelloId(personId).forEach(languagelist::add);
		return languagelist;
	}

	public LanguageEntity getLanguage(String languageid) {

		return languageRepository.findById(languageid).get();
	}

	public void addLanguage(LanguageEntity language) {

		languageRepository.save(language);

	}

	public void updateLanguage(LanguageEntity language) {

		languageRepository.save(language);
	}

	public void deleteLanguage(String language) {

		languageRepository.deleteById(language);

	}

}
