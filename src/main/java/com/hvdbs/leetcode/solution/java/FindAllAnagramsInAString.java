package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.List;

@CodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Find All Anagrams in a String",
        url = "https://leetcode.com/problems/find-all-anagrams-in-a-string/description/",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT
)
public class FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        int l = 0;
        int pN = p.length();

        int[] alphabet = new int[26];
        int[] alphabetTmp = new int[26];
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < pN; i++) {
            alphabet[p.charAt(i) - 'a']++;
        }

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);

            alphabetTmp[c - 'a']++;

            if (r - l + 1 == pN) {
                if (isAnagram(alphabet, alphabetTmp)) {
                    result.add(l);
                }

                alphabetTmp[s.charAt(l) - 'a']--;
                l++;
            }
        }

        return result;
    }

    private boolean isAnagram(int[] s, int[] p) {
        for (int i = 0; i < p.length; i++) {
            if (p[i] - s[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
