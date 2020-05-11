package com.harmellaw;
/*
 * List from https://www.cps.gov.uk/sites/default/files/documents/publications/annex_1a_table_of_offences_scheme_c.pdf
 */
public enum CriminalOffence {

    AFFRAY ("Affray"),
    ARMED_ROBBERY ("Armed robbery"),
    DANGEROUS_DRIVING ("Dangerous driving"),
    ENDANGERING_AN_AIRCRAFT ("Endangering an aircraft"),
    FALSE_ACCOUNTING ("False accounting"),
    GOING_EQUIPPED_TO_STEAL ("Going equipped to steal"),
    HARBOURING_ESCAPED_PRISONER ("Harbouring escaped prisoner"),
    IMPERSONATING_CUSTOMS_OFFICER ("Impersonating Customs officer"),
    KEEPING_A_DISORDERLY_HOUSE ("Keeping a disorderly house"),
    MAKING_OFF_WITHOUT_PAYMENT ("Making off without payment");

    private final String value;

    CriminalOffence(String value) {
        this.value = value;
    }
}
