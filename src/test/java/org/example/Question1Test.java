package org.example;

import org.example.question1.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Question1Test {

    Person interview = new Person();

    @Test  //for old method Boy
    public void test1Old(){
        String val = interview.classifyPerson(12, true);
        assertNotNull(val);
        assertEquals("BOY",val);
    }

    @Test   //for New method Boy
    public void test1New(){
        String val = interview.classifyPerson(12, Person.Genders.MALE);
        assertNotNull(val);
        assertEquals("BOY",val);
    }

    @Test   //for old method MAN
    public void test2Old(){
        String val = interview.classifyPerson(19, true);
        assertNotNull(val);
        assertEquals("MAN",val);
    }

    @Test   //for New method Man
    public void test2New(){
        String val = interview.classifyPerson(19, Person.Genders.MALE);
        assertNotNull(val);
        assertEquals("MAN",val);
    }

    @Test   //for old method Woman
    public void test3Old(){
        String val = interview.classifyPerson(45, false);
        assertNotNull(val);
        assertEquals("WOMAN",val);
    }

    @Test   //for New method Woman
    public void test3New(){
        String val = interview.classifyPerson(45, Person.Genders.FEMALE);
        assertNotNull(val);
        assertEquals("WOMAN",val);
    }

    @Test   //for old method Girl
    public void test4Old(){
        String val = interview.classifyPerson(17, false);
        assertNotNull(val);
        assertEquals("GIRL",val);

    }

    @Test   //for new method Girl
    public void test4New(){
        String val = interview.classifyPerson(17, Person.Genders.FEMALE);
        assertNotNull(val);
        assertEquals("GIRL",val);
    }
}
