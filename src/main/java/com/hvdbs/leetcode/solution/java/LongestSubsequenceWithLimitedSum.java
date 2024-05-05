package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@LeetCodeInfo(difficulty = Difficulty.EASY,
        name = "Longest Subsequence With Limited Sum",
        url = "https://leetcode.com/problems/longest-subsequence-with-limited-sum/")
public class LongestSubsequenceWithLimitedSum {
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] answer = new int[queries.length];
        int maxSubsequenceSize;
        int tmp;

        Arrays.sort(nums);

        for (int i = 0; i < answer.length; i++) {
            maxSubsequenceSize = 0;
            tmp = 0;

            for (int num : nums) {
                if (tmp + num <= queries[i]) {
                    tmp += num;
                    maxSubsequenceSize++;
                } else {
                    break;
                }
            }

            answer[i] = maxSubsequenceSize;
        }

        return answer;
    }
}
