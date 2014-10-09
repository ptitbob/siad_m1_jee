package fr.univ.blois.siad.m1.javaee.jpa.ex00;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author: François Robert
 */
@Entity
public class PersonUni {
	@Id
	private Long id;

	@Column
	private String name;

	public PersonUni() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
