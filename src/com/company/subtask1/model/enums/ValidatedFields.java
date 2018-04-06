package com.company.subtask1.model.enums;

public enum ValidatedFields {
    FIRST_NAME(new String[] { "^[A-Z][a-z]+$" }),
    LAST_NAME(new String[] { "^[A-Z][a-z]+$" }),
    PHONE_NUMBER(new String[] {
            "^\\([0-9]{3}\\)-[0-9]{3}-[0-9]{4}$",
            "^\\([0-9]{3}\\)\\s[0-9]{3}\\s[0-9]{4}$",
            "^[0-9]{3}-[0-9]{3}-[0-9]{4}$",
            "^[0-9]{3}\\s[0-9]{3}\\s[0-9]{4}$"
    }),
    DATE_OF_BIRTH(new String[] {
            "^(0[1-9]|[12][0-9]|3[01]).(0[1-9]|1[0-2]).(19|20)\\d{2}$",
            "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19|20)\\d{2}$",
            "^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-(19|20)\\d{2}$"
    }),
    STREET(new String[] { "^[A-Z][a-z]+(\\s([A-Z][a-z]+))*$" }),
    BUILDING(new String[] { "^[1-9][0-9]{0,4}([a-z]|[A-Z])?$" }),
    ROOM_NUMBER(new String[] { "^(0[1-9]|[1-9][0-9]+)$" });

    private final String[] patterns;

    public String[] getPatterns() {
        return patterns;
    }

    ValidatedFields(String[] patterns) {
        this.patterns = patterns;
    }
}
