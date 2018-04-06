package com.company.subtask2_1.utils;

import java.util.Scanner;

public final class UserInput {
    private final static Scanner INPUT_READER = new Scanner(System.in);

    public static int readInt() {
        return Integer.parseInt(INPUT_READER.nextLine());
    }
}
