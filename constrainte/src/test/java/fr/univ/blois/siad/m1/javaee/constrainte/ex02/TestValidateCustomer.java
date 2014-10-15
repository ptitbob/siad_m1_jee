package fr.univ.blois.siad.m1.javaee.constrainte.ex02;

import fr.univ.blois.siad.m1.javaee.constrainte.common.SiadTest;
import fr.univ.blois.siad.m1.javaee.constrainte.ex01.Person;
import org.junit.Assert;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import java.util.Set;

/**
 * @author: François Robert
 */
public class TestValidateCustomer extends SiadTest {

	@Test
	public void testInstance() {
		Customer customer = new Customer();
		Assert.assertNotNull("le client doit être instancié", customer);
	}

	@Test
	public void testValidationGlobalFail() {
		Customer customer = new Customer();
		Set<ConstraintViolation<Customer>> constraintViolationSet = validate(customer);
		Assert.assertTrue("Le nombre de contrainte violées doit être supérieur à 0", constraintViolationSet.size() > 0);
	}

}
