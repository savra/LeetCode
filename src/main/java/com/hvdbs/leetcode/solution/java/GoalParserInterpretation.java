package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(difficulty = Difficulty.EASY,
        name = "Goal Parser Interpretation",
        url = "https://leetcode.com/problems/goal-parser-interpretation/description/")
public class GoalParserInterpretation {
    public String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }
}
