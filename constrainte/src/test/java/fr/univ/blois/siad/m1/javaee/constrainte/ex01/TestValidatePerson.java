package fr.univ.blois.siad.m1.javaee.constrainte.ex01;

import fr.univ.blois.siad.m1.javaee.constrainte.common.SiadTest;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import java.util.Date;
import java.util.Set;

/**
 * @author: François Robert
 */
public class TestValidatePerson extends SiadTest {

	@Test
	public void validatePerson() {
		Person person = new Person();
		Set<ConstraintViolation<Person>> constraintViolationSet = validate(person);
		Assert.assertTrue("Le nombre de contrainte violées doit être supérieur à zéro", constraintViolationSet.size() > 0);
	}

	@Test
	public void validateNameConvention() {
		Person person = new Person();
		person.setName(null);
		person.setSurname("surname");
		person.setLogin("login");
		person.setActivityCount(3);
		person.setDateOfBirth(new Date());
		person.setMemberShipBegin(new Date());
		Set<ConstraintViolation<Person>> constraintViolationSet = validate(person);
		Assert.assertTrue("Le nombre de contrainte violées doit être égale à 1", constraintViolationSet.size() == 1);
		ConstraintViolation<Person>[] constraintViolations = (ConstraintViolation<Person>[]) constraintViolationSet.toArray();
		Assert.assertEquals("Le message d'erreur n'est pas correctement formaté", "Le nom ne suit pas les conventions", constraintViolations[0].getMessage());
		person.setName(StringUtils.leftPad("A", 51, "B"));
		constraintViolationSet = validate(person);
		Assert.assertTrue("Le nombre de contrainte violées doit être égale à 1", constraintViolationSet.size() == 1);
	}

	@Test
	public void validateNameUpperCase() {
		Person person = new Person();
		person.setName("name");
		person.setSurname("surname");
		person.setLogin("login");
		person.setActivityCount(3);
		person.setDateOfBirth(new Date());
		person.setMemberShipBegin(new Date());
		Set<ConstraintViolation<Person>> constraintViolationSet = validate(person);
		Assert.assertTrue("Le nombre de contrainte violées doit être égale à 1", constraintViolationSet.size() == 1);
		ConstraintViolation<Person>[] constraintViolations = (ConstraintViolation<Person>[]) constraintViolationSet.toArray();
		Assert.assertEquals("Le message d'erreur n'est pas correctement formaté", "Le nom doit être en majuscule", constraintViolations[0].getMessage());
	}
}
