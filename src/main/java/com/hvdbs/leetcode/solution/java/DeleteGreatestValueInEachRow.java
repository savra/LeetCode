package com.hvdbs.leetcode.solution.java;

import java.util.Arrays;
import java.util.OptionalInt;

public class DeleteGreatestValueInEachRow {
    public int deleteGreatestValue(int[][] grid) {
        return Arrays.stream(grid).map(value -> Arrays.stream(value).max()).distinct().map(OptionalInt::getAsInt).reduce(0, Integer::sum);
    }
}
