package com.company.subtask1.utils;

public final class Validator {
    private Validator() {}

    public static boolean isValid(String str, String... patterns) {
        for (String pattern : patterns) {
            if (str.matches(pattern)) {
                return true;
            }
        }

        return false;
    }
}
