package fr.univ.blois.siad.m1.javaee.jpa.ex00;

import fr.univ.blois.siad.m1.javaee.jpa.common.SiadTest;
import org.junit.Test;

public class PersonTest extends SiadTest {

	@Test
	public void test() {
		Person person = new Person();
		person.setId(1L);
		person.setName("test");
		persist(new Person());
	}

}