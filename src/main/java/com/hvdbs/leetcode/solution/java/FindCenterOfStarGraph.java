package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Find Center of Star Graph",
        url = "https://leetcode.com/problems/find-center-of-star-graph/description/")
public class FindCenterOfStarGraph {
    public int findCenter(int[][] edges) {
        return edges[0][0] == edges[1][0] ? edges[0][0] : edges[0][0] == edges[1][1] ? edges[0][0] : edges[0][1];
    }
}
