package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Find Greatest Common Divisor of Array",
        url = "https://leetcode.com/problems/find-greatest-common-divisor-of-array/")
public class FindGreatestCommonDivisorOfArray {
    public static int findGCD(int[] nums) {
        Arrays.sort(nums);

        int divisor = nums[nums.length - 1];

        while (!(nums[nums.length - 1] % divisor == 0 && nums[0] % divisor == 0)) {
            divisor--;
        }

        return divisor;
    }

    public static void main(String[] args) {
        System.out.println(findGCD(new int[] {2,5,6,9,10}));
        System.out.println(findGCD(new int[] {7,5,6,8,3}));
        System.out.println(findGCD(new int[] {3,3}));
    }
}
