package com.drucare.project.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class LanguageEntity {
	@Id
	private String id;
	private String languageName;
	private String languageDescription;
	@ManyToOne
	private PersonEntity personEntity;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LanguageEntity(String id, String languageName, String languageDescription, String personId) {
		super();
		this.id = id;
		this.languageName = languageName;
		this.languageDescription = languageDescription;
		this.personEntity = new PersonEntity(personId, "", "");
	}

	public LanguageEntity() {

	}

	public String getLanguageName() {
		return languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	public String getLanguageDescription() {
		return languageDescription;
	}

	public void setLanguageDescription(String languageDescription) {
		this.languageDescription = languageDescription;
	}

	public PersonEntity getPersonEntity() {
		return personEntity;
	}

	public void setPersonEntity(PersonEntity personEntity) {
		this.personEntity = personEntity;
	}
}
