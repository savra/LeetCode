package com.hvdbs.leetcode.solution.java;

import java.util.HashSet;
import java.util.Set;

public class CheckDistancesBetweenSameLetters {
    public static boolean checkDistances(String s, int[] distance) {
        Set<Character> tmp = new HashSet<>();

        for(int i = 0; i < s.length(); i++) {
            char c  = s.charAt(i);

            if (!tmp.contains(c)) {
                int nextIndex = s.indexOf(c, i + 1);

                if (nextIndex - i - 1 != distance[i]) {
                    return false;
                }
            }

            tmp.add(c);
        }

        return true;
    }

    public static void main(String[] args) {
        checkDistances("abaccb", new int[] {1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0});
    }
}
