package fr.univ.blois.siad.m1.javaee.jpa.ex00;

import fr.univ.blois.siad.m1.javaee.jpa.common.SiadTest;
import org.junit.Test;

public class PersonUniTest extends SiadTest {

	@Test
	public void test() {
		PersonUni personUni = new PersonUni();
		personUni.setId(1L);
		personUni.setName("test");
		persist(personUni);
	}

}