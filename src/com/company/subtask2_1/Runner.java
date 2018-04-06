package com.company.subtask2_1;

import com.company.subtask2_1.utils.*;
import java.util.*;

public final class Runner {
    private Runner() {}

    private static void printCollection(String msg, Collection<Integer> c) {
        System.out.println(msg);
        for (Integer i : c) {
            System.out.println(i);
        }
    }

    public static void run() {
        final Set<Integer> valueSet = new HashSet<>();
        final List<Integer> valueList = new ArrayList<>();

        try {
            System.out.println("Enter total length of data structures");
            int n = UserInput.readInt();

            System.out.println("Input lower bound of range of values");
            int from = UserInput.readInt();

            System.out.println("Input upper bound of range of values");
            int to = UserInput.readInt();

            Filler.fillCollection(valueSet, n, from, to);
            Filler.fillCollection(valueList, n, from, to);

            printCollection("--SET--", valueSet);
            printCollection("--LIST--", valueList);
        } catch (NumberFormatException e) {
            System.out.println("Illegal number format");
        }
    }
}
