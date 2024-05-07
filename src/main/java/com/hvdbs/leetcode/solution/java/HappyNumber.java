package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.HashSet;
import java.util.Set;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Happy Number",
        url = "https://leetcode.com/problems/happy-number",
        timeComplexity = "O(N)",
        spaceComplexity = "O(1)")
public class HappyNumber {
    public boolean isHappy(int n) {
        /*//TC: O(N), SC: O(1)
        int slow = n;
        int fast = n;

        do {
            slow = digitSquareSum(slow);
            fast = digitSquareSum(fast);
            fast = digitSquareSum(fast);

            if (fast == 1) {
                return true;
            }
        } while (slow != fast);

        return slow == 1; */

        //TC: O(N), SC: O(N)
        Set<Integer> set = new HashSet<>();
        int tmp = digitSquareSum(n);

        while (true) {
            if (tmp == 1) {
                return true;
            } else {
                if (set.contains(tmp)) {
                    return false;
                } else {
                    set.add(tmp);
                }
            }

            tmp = digitSquareSum(tmp);
        }
    }

    private int digitSquareSum(int n) {
        int tmp = n;
        int powSum = 0;

        while (tmp > 0) {
            powSum += Math.pow(tmp % 10, 2);
            tmp /= 10;
        }

        return powSum;
    }
}
