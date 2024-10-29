package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayDeque;
import java.util.Deque;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Backspace String Compare",
        url = "https://leetcode.com/problems/backspace-string-compare",
        spaceComplexity = Complexity.ConstantComplexity.LINEAR,
        timeComplexity = Complexity.ConstantComplexity.LINEAR)
public class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        Deque<Character> stack = backspacing(s);
        Deque<Character> stack2 = backspacing(t);

        if (stack.size() != stack2.size()) {
            return false;
        }

        while(!stack.isEmpty()) {

            if (stack.pollFirst() != stack2.pollFirst()) {
                return false;
            }
        }

        return true;
    }

    private Deque<Character> backspacing(String source) {
        Deque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i < source.length(); i++) {
            char currentCharacter = source.charAt(i);

            if (currentCharacter == '#') {
                stack.pollFirst();
            } else {
                stack.offerFirst(currentCharacter);
            }
        }

        return stack;
    }
}
