package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Find Pivot Index",
        url = "https://leetcode.com/problems/find-pivot-index"
)
public class FindPivotIndex {
    //My Time Complexity: O(n^2)
    //My Space complexity: O(1)
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                rightSum += nums[j];
            }

            if (rightSum == leftSum) {
                return i;
            }

            leftSum += nums[i];

            rightSum = 0;
        }

        return -1;
    }
}
