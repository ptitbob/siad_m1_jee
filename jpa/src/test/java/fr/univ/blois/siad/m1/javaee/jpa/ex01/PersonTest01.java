package fr.univ.blois.siad.m1.javaee.jpa.ex01;

import fr.univ.blois.siad.m1.javaee.jpa.common.SiadTest;
import org.eclipse.persistence.exceptions.DatabaseException;
import org.junit.Test;
import org.pmw.tinylog.Logger;

import javax.persistence.PersistenceException;
import javax.persistence.RollbackException;

import static org.junit.Assert.fail;

/**
 * @author: François Robert
 */
public class PersonTest01 extends SiadTest {

	/**
	 * Test de verification que l'on ne peux pas inserer 2 personnes avec le même login
	 */
	@Test
	public void testLoginIsUnique() {
		Person person1 = new Person();
		person1.setId(1L);
		person1.setName("person1");
		person1.setLogin("a");
		Person person2 = new Person();
		person2.setId(2L);
		person2.setName("person2");
		person2.setLogin("a");
		persist(person1);
		try {
			persist(person2);
			fail("Ne doit pas pouvoir inserer deux personne avec le même login");
		} catch (PersistenceException e) {
			Logger.info("Succes du test d'unicité des logins");
		}
	}

	@Test
	public void testNameNotNull() {
		Person person = new Person();
		person.setId(10L);
		person.setLogin("b");
		try {
			persist(person);
			fail("Ne doit pas pouvoir persister une personne sans nom");
		} catch (PersistenceException e) {
			Logger.info("Succes du test de non nullité du nom de la personne");
		}
	}

	@Test
	public void testLoginNotNull() {
		Person person = new Person();
		person.setId(20L);
		person.setName("person");
		try {
			persist(person);
			fail("Ne doit pas pouvoir persister une personne sans login");
		} catch (PersistenceException e) {
			Logger.info("Succes du test de non nullité du login de la personne");
		}
	}
}
