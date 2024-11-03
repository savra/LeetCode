package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayDeque;
import java.util.Deque;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Crawler Log Folder",
        url = "https://leetcode.com/problems/crawler-log-folder",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.LINEAR)
public class CrawlerLogFolder {
    private static final String UP = "../";
    private static final String CURRENT = "./";

    public int minOperations(String[] logs) {
        Deque<String> stack = new ArrayDeque<>();

        for (String command : logs) {
            if (command.equals(CURRENT)) {
                continue;
            }

            if (command.equals(UP)) {
                stack.pollFirst();
            } else {
                stack.offerFirst(command);
            }
        }

        return stack.size();
    }
}
