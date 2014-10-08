package fr.univ.blois.siad.m1.javaee.cdi.ex02;

import fr.univ.blois.siad.m1.javaee.cdi.ex01.ServiceUser01;
import fr.univ.blois.siad.m1.javaee.common.SiadTest;
import org.junit.Test;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

/**
 * @author: François Robert
 */
public class TestServiceUser02 extends SiadTest {

	@Test
	public void validateInitializeRandomNumber() {
		ServiceUser02 serviceUser02 = null;
		assertNotNull("L'instance ne doit pas être nulle", serviceUser02);
		assertNotNull("le nombre doit être affecté", serviceUser02.getRandomNumber());
		assertTrue("Le nombre doit être compris de manière aléatoire entre 1 et 10", serviceUser02.getRandomNumber() > 1 && serviceUser02.getRandomNumber() <= 10);
	}

}
