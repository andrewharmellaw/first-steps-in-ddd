package com.harmellaw;

import java.util.HashSet;
import java.util.Set;

public class PoliceInvestigation {

    public PNCId pncId;
    public Set<Suspect> suspects = new HashSet<>();

    public PoliceInvestigation(PNCId pncId, Suspect suspect) {
        if (pncId == null) throw new IllegalArgumentException("You must provide a PNC Id");
        if (suspect == null) throw new IllegalArgumentException("You must provide a suspect");

        this.pncId = pncId;
        this.suspects.add(suspect);
    }
}
