package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Remove Duplicates from Sorted Array",
        url = "https://leetcode.com/problems/remove-duplicates-from-sorted-array/")
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        Set<Integer> uniqueArray = new TreeSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            uniqueArray.add(nums[i]);
        }

        List<Integer> integerList = uniqueArray.stream().toList();

        for (int i = 0; i < integerList.size(); i++) {
            nums[i] = integerList.get(i);
        }

        return uniqueArray.size();
    }
}
