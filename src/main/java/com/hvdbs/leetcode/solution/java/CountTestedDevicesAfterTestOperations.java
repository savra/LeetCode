package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Count Tested Devices After Test Operations",
        url = "https://leetcode.com/problems/count-tested-devices-after-test-operations")
public class CountTestedDevicesAfterTestOperations {
    public int countTestedDevices(int[] batteryPercentages) {
        int testedDevices = 0;

        for (int i = 0; i < batteryPercentages.length; i++) {
            if (batteryPercentages[i] > 0) {
                testedDevices++;

                for (int j = i + 1; j < batteryPercentages.length; j++) {
                    batteryPercentages[j] = Math.max(0, batteryPercentages[j] - 1);
                }
            }
        }

        return testedDevices;
    }
}
