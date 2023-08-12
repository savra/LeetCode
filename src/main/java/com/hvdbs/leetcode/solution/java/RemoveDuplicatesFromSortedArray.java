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
    public static int removeDuplicates(int[] nums) {
        /* NOT IN-PLACE
        Set<Integer> uniqueArray = new TreeSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            uniqueArray.add(nums[i]);
        }

        List<Integer> integerList = uniqueArray.stream().toList();

        for (int i = 0; i < integerList.size(); i++) {
            nums[i] = integerList.get(i);
        }

        return uniqueArray.size();*/

        int length = nums.length;

        int i = 1;

        while (i < length) {
            if (nums[i] == nums[i - 1]) {
                int tmp = nums[i];
                replaceElement(nums, i);
                nums[nums.length - 1] = tmp;
                length--;
            } else {
                i++;
            }
        }

        return i;
    }

    private static void replaceElement(int[] nums, int position){
        for (int i = position + 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }
    }

    public static void main(String[] args) {
        int i = removeDuplicates(new int[]{1,1,1});
    }
}
