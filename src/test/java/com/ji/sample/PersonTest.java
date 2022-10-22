package com.ji.sample;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @BeforeEach
    void setUp() {
        //ok finale
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getName() {
        Person p = new Person("Luca","Coraci");
        assertEquals("Luca",p.getName());
    }

    @Test
    void setName() {
        Person p = new Person("Luca","Coraci");
        assertEquals("Luca",p.getName());
        p.setName("Alfonso");
        assertEquals("Alfonso",p.getName());
    }

    @Test
    void getSurname() {
        Person p = new Person("Luca","Coraci");
        assertEquals("Coraci",p.getSurname());
    }

    @Test
    void setSurname() {
        Person p = new Person("Luca","Coraci");
        assertEquals("Coraci",p.getSurname());
        p.setSurname("Rossi");
        assertEquals("Rossi",p.getSurname());
    }
}