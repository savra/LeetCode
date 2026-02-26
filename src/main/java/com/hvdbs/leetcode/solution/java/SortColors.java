package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Sort Colors",
        url = "https://leetcode.com/problems/sort-colors/description/",
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        timeComplexity = Complexity.ConstantComplexity.LINEAR /*На самом деле 2n*/
)
public class SortColors {
    public void sortColors(int[] nums) {
        int insPos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                swap(nums, i, insPos);
                insPos++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                swap(nums, i, insPos);
                insPos++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
