package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        name = "Flipping an Image",
        url = "https://leetcode.com/problems/flipping-an-image",
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        timeComplexity = Complexity.ConstantComplexity.BILINEAR,
        difficulty = Difficulty.EASY
)
public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] ints : image) {
            for (int j = 0, k = ints.length - 1; j < k; j++, k--) {
                swap(ints, j, k);
            }
        }

        for (int[] ints : image) {
            for (int j = 0; j < ints.length; j++) {
                invert(ints, j);
            }
        }

        return image;
    }

    private void swap(int[] arr, int firstElem, int secondElem) {
        int tmp = arr[firstElem];
        arr[firstElem] = arr[secondElem];
        arr[secondElem] = tmp;
    }

    private void invert(int[] arr, int idx) {
        if (arr[idx] == 1) {
            arr[idx] = 0;
        } else {
            arr[idx] = 1;
        }
    }
}
