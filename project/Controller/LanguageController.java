package com.drucare.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.drucare.project.Entity.LanguageEntity;
import com.drucare.project.Entity.PersonEntity;
import com.drucare.project.Service.LanguageService;

@RestController
public class LanguageController {
	@Autowired
	public LanguageService languageService;

	@RequestMapping("/persons/{id}/languages")
	public List<LanguageEntity> getAllTheLanguages(@PathVariable String id) {
		return languageService.getAllTheLanguages(id);
	}

	@RequestMapping("/persons/{id}/languages/{languageid}")
	public LanguageEntity getLanguage(@PathVariable String languageid) {
		return languageService.getLanguage(languageid);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/persons/{personId}/languages")
	public void addlanguages(@RequestBody LanguageEntity language, @PathVariable String personId) {
		language.setPersonEntity(new PersonEntity(personId, "", ""));
		languageService.addLanguage(language);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/persons/{personId}/languages/{languageId}")
	public void updateLanguage(@RequestBody LanguageEntity language, @PathVariable String personId,
			@PathVariable String languageId) {
		language.setPersonEntity(new PersonEntity(personId, "", ""));
		languageService.updateLanguage(language);

	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/persons/{personId}/languages/{languageId}")
	public void deleteLanguage(@PathVariable String languageId) {
		languageService.deleteLanguage(languageId);
	}

}
