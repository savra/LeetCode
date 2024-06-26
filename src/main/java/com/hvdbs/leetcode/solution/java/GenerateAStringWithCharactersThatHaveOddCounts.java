package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Generate a String With Characters That Have Odd Counts",
        url = "https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts/description/")
public class GenerateAStringWithCharactersThatHaveOddCounts {
    public String generateTheString(int n) {
        if (n == 1) {
            return "a";
        }

        String result = Stream.generate(() -> "a")
                .limit(n % 2 == 0 ? n - 1 : n - 2)
                .collect(Collectors.joining(""));

        return result.length() == n - 2 ? result + "bc" : result + "b";
    }
}
