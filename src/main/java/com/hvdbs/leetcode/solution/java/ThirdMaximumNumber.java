package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Third Maximum Number",
        url = "https://leetcode.com/problems/third-maximum-number"
)
public class ThirdMaximumNumber {
    //My Time Complexity: O(n)
    //My Space complexity: O(1)

    public int thirdMax(int[] nums) {
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;

        for (int num : nums) {
            if (max1 == num || max2 == num || max3 == num) {
                continue;
            }

            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }
        }

        if (max3 == Long.MIN_VALUE) {
            return (int)max1;
        }

        return (int)max3;
    }
}
