package fr.univ.blois.siad.m1.javaee.cdi.ex00;

import fr.univ.blois.siad.m1.javaee.common.SiadTest;
import org.junit.Assert;
import org.junit.Test;
import org.pmw.tinylog.Logger;

/**
 * @author : François Robert
 */
public class SuperTest extends SiadTest {

	@Test
	public void testLog() throws InterruptedException {
		System.out.println("MyTest");
		Logger.trace("Log de niveau TRACE");
		Thread.sleep(50);
		Logger.debug("Log de niveau DEBUG");
		Thread.sleep(50);
		Logger.info("Log de niveau information");
		Thread.sleep(50);
		Logger.warn("Log de niveau Warning");
		Thread.sleep(50);
		Logger.error("Log de niveau erreur");
		Thread.sleep(50);
	}

	@Test
	public void testInjectClass() {
		Logger.trace("Test d'injection de classe via le container CDI");
		MiscService miscService = getNestedInstance(MiscService.class);
		Assert.assertNotNull(miscService);
		Assert.assertEquals("La valeur retournée n'est pas correcte", "valeur de test", miscService.getTestSentence());
	}

}
