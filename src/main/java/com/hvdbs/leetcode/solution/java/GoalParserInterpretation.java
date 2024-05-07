package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Goal Parser Interpretation",
        url = "https://leetcode.com/problems/goal-parser-interpretation/description/")
public class GoalParserInterpretation {
    public String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }
}
