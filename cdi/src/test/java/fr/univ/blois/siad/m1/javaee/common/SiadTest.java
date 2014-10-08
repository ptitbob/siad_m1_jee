package fr.univ.blois.siad.m1.javaee.common;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.pmw.tinylog.Configurator;
import org.pmw.tinylog.writers.ConsoleWriter;

import static org.pmw.tinylog.Level.TRACE;

/**
 * @author : François Robert
 */
public abstract class SiadTest {

	protected static Weld weld;
	protected static WeldContainer container;

	@BeforeClass
	public static void setUp() {
		Configurator.defaultConfig()
			.writer(new ConsoleWriter())
			.level(TRACE)
			.activate();
		weld = new Weld();
		container = weld.initialize();
	}

	@AfterClass
	public static void tearDown() {
		weld.shutdown();
	}

	protected <C> C getNestedInstance(Class<C> nestedClass) {
		return container.instance().select(nestedClass).get();
	}

}
