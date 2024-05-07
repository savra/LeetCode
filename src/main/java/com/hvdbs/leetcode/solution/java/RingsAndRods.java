package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Rings and Rods",
        url = "https://leetcode.com/problems/rings-and-rods/description/")
public class RingsAndRods {
    public int countPoints(String rings) {
        Map<Character, Set<Character>> temp = new HashMap<>();

        for(int i = rings.length() - 1; i > 0; i -= 2) {
            if (temp.get(rings.charAt(i)) == null) {
                Set<Character> value = new HashSet<>();
                value.add(rings.charAt(i - 1));
                temp.put(rings.charAt(i), value);
            } else {
                temp.get(rings.charAt(i)).add(rings.charAt(i - 1));
            }
        }

        return (int)temp.entrySet()
                .stream()
                .filter(entry -> entry.getValue().size() == 3)
                .count();
    }
}
