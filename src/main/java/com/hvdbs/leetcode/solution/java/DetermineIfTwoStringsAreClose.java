package com.hvdbs.leetcode.solution.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DetermineIfTwoStringsAreClose {
    public static boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        char[] firstWord = word1.toCharArray();
        Arrays.sort(firstWord);

        char[] secondWord = word2.toCharArray();
        Arrays.sort(secondWord);

        String sorted1 = new String(firstWord);
        String sorted2 = new String(secondWord);

        if (sorted1.equals(sorted2)) {
            return true;
        }

        boolean charContains;

        for (char c : firstWord) {
            charContains = false;
            for (char value : secondWord) {
                if (c == value) {
                    charContains = true;
                    break;
                }
            }

            if (!charContains) {
                return false;
            }
        }

        List<Integer> firstSubSequence = new ArrayList<>();
        List<Integer> secondSubSequence = new ArrayList<>();

        int countChars = 0;

        getCharCount(firstWord, firstSubSequence, countChars);

        getCharCount(secondWord, secondSubSequence, countChars);

        firstSubSequence.sort(Comparator.comparingInt(value -> value));
        secondSubSequence.sort(Comparator.comparingInt(value -> value));

        for (int i = 0; i < firstSubSequence.size(); i++) {
            if (!firstSubSequence.get(i).equals(secondSubSequence.get(i))) {
                return false;
            }
        }

        return true;
    }

    private static void getCharCount(char[] firstWord, List<Integer> firstSubSequence, int countChars) {
        for (int i = 0; i <= firstWord.length - 1; i++) {
            if (i == firstWord.length - 1) {
                firstSubSequence.add(++countChars);
                break;
            }

            if (firstWord[i] == firstWord[i + 1]) {
                countChars++;
            } else {
                firstSubSequence.add(countChars + 1);
                countChars = 0;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(closeStrings("cabbba", "abbccc"));
    }
}
