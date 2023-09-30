package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Count Symmetric Integers",
        url = "https://leetcode.com/problems/count-symmetric-integers"
)
public class CountSymmetricIntegers {
    //My Time Complexity: O(n * Log10M)
    //My Space complexity: O(n * Log10M)
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;

        for (int i = low; i <= high; i++) {
            int digitCount = (int)Math.log10(i) + 1;

            if (digitCount % 2 == 0) {
                String s = String.valueOf(i);

                int sum1 = 0;
                int sum2 = 0;

                for (int j = 0, k = s.length() - 1; j < k; j++, k--) {
                    sum1 += s.charAt(j);
                    sum2 += s.charAt(k);
                }

                if (sum1 == sum2) {
                    count++;
                }
            }
        }

        return count;
    }
}
