package fr.univ.blois.siad.m1.javaee.jpa.ex01;

import fr.univ.blois.siad.m1.javaee.jpa.common.SiadTest;
import fr.univ.blois.siad.m1.javaee.jpa.ex01.domain.Person;
import fr.univ.blois.siad.m1.javaee.jpa.ex01.services.PersonManager;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by francois on 13/11/14.
 */
public class PersonManagerTest extends SiadTest {

    @Test
    public void createPersonTest() {
        PersonManager personManager = getNestedInstance(PersonManager.class);
        assertNotNull(personManager);
        // Placer votre code ici
    }


}
