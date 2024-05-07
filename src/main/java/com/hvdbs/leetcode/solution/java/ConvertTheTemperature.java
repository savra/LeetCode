package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Convert the Temperature",
        url = "https://leetcode.com/problems/convert-the-temperature/description/")
public class ConvertTheTemperature {
    public double[] convertTemperature(double celsius) {
        return new double[] {celsius + 273.15, (celsius * 9 / 5) + 32};
    }
}
