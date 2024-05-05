package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Sum of Squares of Special Elements",
        url = "https://leetcode.com/problems/sum-of-squares-of-special-elements",
        timeComplexity = "O(N)",
        spaceComplexity = "O(1)")
public class SumOfSquaresOfSpecialElements {
    //My Time Complexity: O(n)
    //My Space complexity: O(1)
    public int sumOfSquares(int[] nums) {
        int result = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (n % (i + 1) == 0) {
                result += nums[i] * nums[i];
            }
        }

        return result;
    }
}
