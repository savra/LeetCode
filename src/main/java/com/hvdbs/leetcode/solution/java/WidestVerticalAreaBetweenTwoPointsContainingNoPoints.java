package com.hvdbs.leetcode.solution.java;

import java.util.Arrays;
import java.util.Comparator;

public class WidestVerticalAreaBetweenTwoPointsContainingNoPoints {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (o1, o2) -> {
            if (o1[0] > o2[0]) {
                return 1;
            } else if (o1[0] < o2[0]) {
                return -1;
            } else {
                return Integer.compare(o1[1], o2[1]);
            }
        });

        for ()
    }
}
