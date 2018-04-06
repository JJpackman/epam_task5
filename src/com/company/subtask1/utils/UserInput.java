package com.company.subtask1.utils;

import java.util.Scanner;

public final class UserInput {
    private final static Scanner CONSOLE_READER = new Scanner(System.in);

    private UserInput() {}

    public static String read() {
        return CONSOLE_READER.nextLine();
    }
}
