package com.hvdbs.leetcode.statsgenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StatsGenerator {
    public static void generate() {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();

        try(InputStream inputStream = ClassLoader.getSystemClassLoader().getResourceAsStream("com/hvdbs/leetcode/solution");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {

        } catch (IOException | NullPointerException e) {

        }
    }
}
