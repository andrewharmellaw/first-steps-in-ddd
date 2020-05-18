package com.harmellaw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class APoliceInvestigation {

    PNCId aPncId;
    Suspect aSuspect;
    PoliceInvestigation anInvestigation;

    @BeforeEach
    public void setup() {
        aPncId = new PNCId("1234-ESDT");
        aSuspect = new Suspect();
        anInvestigation = new PoliceInvestigation(aPncId, aSuspect);
    }

    @Test
    public void mustHaveAPoliceNationalComputerId() {
        assertNotNull(anInvestigation.pncId);
    }

    @Test
    public void cantBeCreatedWithAnEmptyPoliceNationalComputerId() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            anInvestigation = new PoliceInvestigation(null, aSuspect);
        });
        assertTrue(exception.getMessage().contains("You must provide a PNC Id"));
    }

    @Test
    public void cantBeCreatedWithNoSuspect() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            anInvestigation = new PoliceInvestigation(aPncId, null);
        });
        assertTrue(exception.getMessage().contains("You must provide a suspect"));
    }
}
