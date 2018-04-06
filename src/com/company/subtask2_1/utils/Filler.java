package com.company.subtask2_1.utils;

import java.util.*;

public final class Filler {
    private static final Random RANDOMIZER = new Random();

    private static Integer[] getFilledArray(int n, int from, int to) {
        Integer[] arr = new Integer[n];

        for (int posToFill = 0; posToFill < arr.length; posToFill++) {
            arr[posToFill] = RANDOMIZER.nextInt((to - from) + 1) + from;
        }

        return arr;
    }

    public static void fillCollection(Collection<Integer> dataStructure, int n, int from ,int to) {
        Collections.addAll(dataStructure, getFilledArray(n, from, to));
    }
}
