package fr.univ.blois.siad.m1.javaee.constrainte.common;

import org.junit.BeforeClass;
import org.pmw.tinylog.Configurator;
import org.pmw.tinylog.Logger;
import org.pmw.tinylog.writers.ConsoleWriter;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import java.util.Set;

import static org.pmw.tinylog.Level.TRACE;


/**
 * @author: François Robert
 */
public class SiadTest {

	protected static ValidatorFactory validatorFactory;
	protected static Validator validator;

	@BeforeClass
	public static void setUp() {
		validatorFactory = Validation.buildDefaultValidatorFactory();
		validator = validatorFactory.getValidator();
		Configurator.defaultConfig()
			.writer(new ConsoleWriter())
			.level(TRACE)
			.activate();
	}

	public static void tearDown() {
		validatorFactory.close();
	}

	protected <C> Set<ConstraintViolation<C>> validate(C beanToValidate) {
		Set<ConstraintViolation<C>> constraintViolationSet = validator.validate(beanToValidate);
		return displayContraintViolations(constraintViolationSet);
	}

	private <C> Set<ConstraintViolation<C>> displayContraintViolations(Set<ConstraintViolation<C>> constraintViolations) {
		for (ConstraintViolation constraintViolation : constraintViolations) {
			Logger.warn(constraintViolation.getRootBeanClass().getSimpleName() +
				"." + constraintViolation.getPropertyPath() + " - Invalid Value = " + constraintViolation.getInvalidValue() + " - Error Msg = " + constraintViolation.getMessage());

		}
		return constraintViolations;
	}

}
