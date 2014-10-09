package fr.univ.blois.siad.m1.javaee.jpa.ex01;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;

/**
 * @author: François Robert
 */
@Entity
public class Person {
	@Id
	private Long id;

	private String name;

	private String login;

	public Person() {
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Person)) return false;

    Person person = (Person) o;

    if (!id.equals(person.id)) return false;
    if (!login.equals(person.login)) return false;
    if (name != null ? !name.equals(person.name) : person.name != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = id.hashCode();
    result = 31 * result + login.hashCode();
    return result;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Person{");
    sb.append("id=").append(id);
    sb.append(", name='").append(name).append('\'');
    sb.append(", login='").append(login).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
