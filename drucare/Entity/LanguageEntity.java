package com.drucare.Entity;

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
	private PersonEntity hello;

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
		this.hello = new PersonEntity(personId, "", "");
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
		return hello;
	}

	public void setPersonEntity(PersonEntity personEntity) {
		this.hello = personEntity;
	}
}