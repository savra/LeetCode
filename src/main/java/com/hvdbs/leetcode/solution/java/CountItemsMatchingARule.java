package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.List;

@LeetCodeInfo(difficulty = Difficulty.EASY,
        name = "Count Items Matching a Rule",
        url = "https://leetcode.com/problems/count-items-matching-a-rule/description/")
public class CountItemsMatchingARule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        return (int) items.stream()
                .filter(item -> ruleKey.equals("type") && item.get(0).equals(ruleValue)
                        || ruleKey.equals("color") && item.get(1).equals(ruleValue)
                        || ruleKey.equals("name") && item.get(2).equals(ruleValue)
                ).count();
    }
}
