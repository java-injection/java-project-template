package com.ji.sample;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @BeforeEach
    void setUp() {
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
        assertEquals("Alfons2o",p.getName());
    }

    @Test
    void getSurname() {
    }

    @Test
    void setSurname() {
    }
}