package fr.univ.blois.siad.m1.javaee.jpa.ex00;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author: François Robert
 */
@Entity
public class Person {
	@Id
	private Long id;

	@Column
	private String name;

	public Person() {
	}

	public Person(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
