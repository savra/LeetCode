package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Valid Parentheses",
        url = "https://leetcode.com/problems/valid-parentheses")
public class ValidParentheses {
    public boolean isValid(String s) {
        java.util.Deque<Character> q = new java.util.ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (q.isEmpty()) {
                q.offerFirst(cur);
            } else {
                Character head = q.peekFirst();

                if ((head == '(' && (cur == '}' || cur == ']'))
                        || (head == '[' && (cur == ')' || cur == '}'))
                        || (head == '{' && (cur == ')' || cur == ']'))) {
                    return false;
                } else if (head == '(' && cur == ')'
                        || head == '{' && cur == '}'
                        || head == '[' && cur == ']') {
                    q.pollFirst();
                } else {
                    q.offerFirst(cur);
                }
            }
        }

        return q.isEmpty();
    }
}
