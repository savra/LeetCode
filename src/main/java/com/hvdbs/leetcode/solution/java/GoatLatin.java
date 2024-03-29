package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Goat Latin",
        url = "https://leetcode.com/problems/goat-latin"
)
public class GoatLatin {
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (i != 0) {
                sb.append(" ");
            }

            String current = words[i];
            char c = current.charAt(0);

            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'
                    || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                sb.append(current);
            } else {
                sb.append(current.substring(1)).append(c);
            }

            sb.append("ma");
            sb.append("a".repeat(i + 1));
        }

        return sb.toString();
    }
}
