package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.*;

@LeetCodeInfo(difficulty = Difficulty.EASY,
        name = "Decode the Message",
        url = "https://leetcode.com/problems/decode-the-message/")
public class DecodeTheMessage {
    public String decodeMessage(String key, String message) {
        char[] tmpKey = key.replace(" ", "").toCharArray();

        Map<Character, Character> substitutionTable = new LinkedHashMap<>();

        for (int i = 'a', j = 0; i <= 'z'; i++, j++) {
            if (substitutionTable.putIfAbsent(tmpKey[j], (char) i) != null) {
                i--;
            }
        }

        char[] tmpMessage = message.toCharArray();

        for (int i = 0; i < tmpMessage.length; i++) {
            if (tmpMessage[i] == ' ') {
                continue;
            }

            tmpMessage[i] = substitutionTable.get(tmpMessage[i]);
        }

        return new String(tmpMessage);
    }
}
