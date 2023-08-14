package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Replace Elements with Greatest Element on Right Side",
        url = "https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side"
)
public class ReplaceElementsWithGreatestElementOnRightSide {
    //My Time Complexity: O(n^2)
    //My Space complexity: O(1)
    public int[] replaceElements(int[] arr) {
        if ( arr.length == 1) {
            arr[0] = -1;
            return arr;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = findMax(arr, i + 1);
        }

        return arr;
    }

    private int findMax(int[] arr, int position) {
        if (position == arr.length) {
            return -1;
        }

        int max = arr[position];

        for (int i = position + 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
