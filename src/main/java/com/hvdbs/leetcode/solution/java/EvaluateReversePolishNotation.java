package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.ArrayDeque;
import java.util.Deque;

@LeetCodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Evaluate Reverse Polish Notation",
        url = "https://leetcode.com/problems/evaluate-reverse-polish-notation")
public class EvaluateReversePolishNotation {
    public int evalRPN(String[] t) {
        Deque<String> s = new ArrayDeque<>();

        for (String value : t) {
            if ("+".equals(value) || "-".equals(value) || "*".equals(value) || "/".equals(value)) {
                s.offerFirst(value);
                String oper = s.pollFirst();
                int o2 = Integer.parseInt(s.pollFirst());
                int o1 = Integer.parseInt(s.pollFirst());

                int result = switch (oper) {
                    case "+" -> o1 + o2;
                    case "-" -> o1 - o2;
                    case "*" -> o1 * o2;
                    default -> o1 / o2;
                };

                s.offerFirst(String.valueOf(result));
            } else {
                s.offerFirst(value);
            }
        }

        return Integer.parseInt(s.pollFirst());
    }
}
