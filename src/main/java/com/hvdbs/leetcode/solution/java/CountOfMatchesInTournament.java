package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Count of Matches in Tournament",
        url = "https://leetcode.com/problems/count-of-matches-in-tournament/description/")
public class CountOfMatchesInTournament {
    public int numberOfMatches(int n) {
        return n - 1;
    }
}
