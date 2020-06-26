package com.harmellaw;

/*
 * List from https://www.cps.gov.uk/sites/default/files/documents/publications/annex_1a_table_of_offences_scheme_c.pdf
 */
public enum CriminalOffence {

    DANGEROUS_DRIVING("Dangerous driving"),
    ENDANGERING_AN_AIRCRAFT("Endangering an aircraft"),
    FALSE_ACCOUNTING("False accounting"),
    IMPERSONATING_CUSTOMS_OFFICER("Impersonating Customs officer"),
    KEEPING_A_DISORDERLY_HOUSE("Keeping a disorderly house"),
    CORRUPTION_IN_PUBLIC_OFFICE("Corruption in public office"),
    CUTTING_AWAY_BUOYS_ETC("Cutting away buoys etc"),
    FALSE_EVIDENCE_BEFORE_EUROPEAN_COURT("False evidence before European Court"),
    FIRING_ON_REVENUE_VESSEL("Firing on Revenue vessel"),
    FRAUDULENT_EVASION_OF_AGRICULTURAL_LEVY("Fraudulent evasion of agricultural levy"),
    MISHANDLING_OR_FALSIFYING_PARKING_DOCUMENTS_ETC("Mishandling or falsifying parking documents etc"),
    OBSTRUCTING_ENGINE_OR_CARRIAGE_ON_RAILWAY("Obstructing engine or carriage on railway");

    private final String value;

    CriminalOffence(String value) {
        this.value = value;
    }
}
