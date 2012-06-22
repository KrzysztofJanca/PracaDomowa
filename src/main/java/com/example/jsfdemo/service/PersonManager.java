package com.example.jsfdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.example.jsfdemo.domain.Person;

@ApplicationScoped
public class PersonManager {
	private List<Person> db = new ArrayList<Person>();

	public void addPerson(Person person) {
		Person newPerson = new Person();

		newPerson.setFirstName(person.getFirstName());
		newPerson.setFrom(person.getFrom());
		newPerson.setNip(person.getNip());

		db.add(newPerson);
	}

	// Removes the person with given PIN
	public void deletePerson(Person person) {
		Person personToRemove = null;
		for (Person p : db) {
			if (person.getNip().equals(p.getNip())) {
				personToRemove = p;
				break;
			}
		}
		if (personToRemove != null)
			db.remove(personToRemove);
	}

	public List<Person> getAllPersons() {
		return db;
	}
}
