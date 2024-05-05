package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.ArrayDeque;
import java.util.Deque;

@LeetCodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Daily Temperatures",
        url = "https://leetcode.com/problems/daily-temperatures")
public class DailyTemperatures {
    public int[] dailyTemperatures(int[] t) {
        int n = t.length;
        int[] res = new int[n];
        Deque<Integer> s = new ArrayDeque<>();

        s.offerFirst(0);

        for (int i = 1; i < t.length; i++) {
            Integer head = s.peekFirst();

            while (head != null && t[i] > t[head]) {
                res[head] = i - head;
                s.pollFirst();
                head = s.peekFirst();
            }

            s.offerFirst(i);
        }

        return res;
    }
}
