package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Reverse Vowels of a String",
        url = "https://leetcode.com/problems/reverse-vowels-of-a-string/description")
public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        if (s.length() == 1) {
            return s;
        }

        char[] tmp = s.toCharArray();

        int i = 0, j = tmp.length - 1;

        while (i < j) {
            if (tmp[i] == 'a' || tmp[i] == 'e' || tmp[i] == 'i' || tmp[i] == 'o' || tmp[i] == 'u'
                    || tmp[i] == 'A' || tmp[i] == 'E' || tmp[i] == 'I' || tmp[i] == 'O' || tmp[i] == 'U') {
                if (tmp[j] == 'a' || tmp[j] == 'e' || tmp[j] == 'i' || tmp[j] == 'o' || tmp[j] == 'u'
                        || tmp[j] == 'A' || tmp[j] == 'E' || tmp[j] == 'I' || tmp[j] == 'O' || tmp[j] == 'U') {
                    char t = tmp[i];
                    tmp[i] = tmp[j];
                    tmp[j] = t;

                    i++;
                    j--;
                } else {
                    j--;
                }
            } else {
                i++;
            }
        }

        return new String(tmp);
    }
}
