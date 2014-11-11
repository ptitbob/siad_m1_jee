package fr.univ.blois.siad.m1.javaee.jpa.common;

import org.junit.BeforeClass;
import org.pmw.tinylog.Configurator;
import org.pmw.tinylog.writers.ConsoleWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import static org.pmw.tinylog.Level.TRACE;


/**
 * @author : François Robert
 */
public class SiadTest {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;

	@BeforeClass
	public static void setUp() {
		Configurator.defaultConfig()
			.writer(new ConsoleWriter())
			.level(TRACE)
			.activate();
		entityManagerFactory = Persistence.createEntityManagerFactory("entityPU");
		entityManager = entityManagerFactory.createEntityManager();
	}

	public static void tearDown() {
		if (entityManager != null) {
			entityManager.close();
		}
		if (entityManagerFactory != null) {
			entityManagerFactory.close();
		}
	}

	protected <E> E persist(E entity) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(entity);
		entityTransaction.commit();
		return entity;
	}

}
