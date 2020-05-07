package com.harmellaw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class APoliceInvestigation {

    @BeforeEach
    public void setup() {
        // Setup to run before each test
    }

    @Test
    public void shouldHaveAtLLeastOneSuspect() {
        Suspect aSuspect = new Suspect();
        Investigation anInvestigation = new Investigation(aSuspect);
        assertFalse(anInvestigation.suspects.isEmpty());
    }
    
    @Test
    public void cantHaveZeroSuspects() {

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Investigation anInvestigation = new Investigation(null);
        });

        assertTrue(exception.getMessage().contains("You must provide a suspect"));
    }
    
    @Test
    public void shouldBeSomething() {
        // Make assertions
    }

    @Test
    public void shouldDoSomethingElse_whenSomethingHappens() {
        // Make assertions
    }

}
