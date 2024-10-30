package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayDeque;
import java.util.Deque;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Make The String Great",
        url = "https://leetcode.com/problems/make-the-string-great",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.LINEAR)
public class MakeTheStringGreat {
    public String makeGood(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char curChar = s.charAt(i);
            Character last = stack.peekFirst();

            if (last != null) {
                int diff = Math.abs(curChar - last);

                if (diff == 32) {
                    stack.pollFirst();
                } else {
                    stack.offerFirst(curChar);
                }
            } else {
                stack.offerFirst(curChar);
            }
        }

        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            sb.append(stack.pollFirst());
        }

        return sb.reverse().toString();
    }
}
