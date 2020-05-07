package com.harmellaw;

import java.util.HashSet;
import java.util.Set;

public class PoliceInvestigation {
    public Set<Suspect> suspects = new HashSet<>();

    public PoliceInvestigation(Suspect aSuspect) {
        if (aSuspect == null) throw new IllegalArgumentException("You must provide a suspect");
        suspects.add(aSuspect);
    }
}
