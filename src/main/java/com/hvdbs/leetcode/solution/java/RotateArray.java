package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayDeque;
import java.util.Queue;

@CodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Rotate Array",
        url = "https://leetcode.com/problems/rotate-array")
public class RotateArray {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotate2(int[] nums, int k) {
        Queue<Integer> q = new ArrayDeque<>();

        for (int i = nums.length - k; i < nums.length; i++) {
            q.offer(nums[i]);
        }

        for (int i = 0; i < nums.length - k; i++) {
            q.offer(nums[i]);
        }

        int i = nums.length - 1;

        while (!q.isEmpty()) {
            nums[i] = q.poll();
            i--;
        }
    }

    public static void main(String[] args) {
        rotate2(new int[]{1,2,3,4,5,6,7}, 3);
    }
}
