package fr.univ.blois.siad.m1.javaee.jpa.ex02;

import fr.univ.blois.siad.m1.javaee.jpa.common.SiadTest;
import fr.univ.blois.siad.m1.javaee.jpa.ex01.Person;
import org.junit.Assert;
import org.junit.Test;
import org.pmw.tinylog.Logger;

import javax.persistence.PersistenceException;

import static org.junit.Assert.fail;

/**
 * @author: François Robert
 */
public class PersonTest02_1 extends SiadTest {

	@Test
	public void testInsertPersonWithoutId() {
		Person person1 = new Person();
		person1.setName("person1");
		person1.setLogin("a");
		Person person2 = new Person();
		person2.setName("person2");
		person2.setLogin("b");
		Person person3 = new Person();
		person3.setName("person2");
		person3.setLogin("b");
		try {
			persist(person1);
			persist(person2);
			persist(person3);
			Logger.info("Insetion reussie");
		} catch (PersistenceException e) {
			fail("insetion impossible, l'id n'est pas fixé");
		}
		Assert.assertEquals("L'identifiant de la personne 1 doit être...", new Long(11), person2.getId());
	}

}
