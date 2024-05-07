package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.List;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Cells in a Range on an Excel Sheet",
        url = "https://leetcode.com/problems/cells-in-a-range-on-an-excel-sheet/description/")
public class CellsInARangeOnAnExcelSheet {
    public List<String> cellsInRange(String s) {
        List<String> result = new ArrayList<>();

        int startColumnIndex = s.charAt(0);
        int endColumnIndex = s.charAt(3);

        int startIndex = Character.getNumericValue(s.charAt(1));
        int endIndex = Character.getNumericValue(s.charAt(4));

        for (int i = startColumnIndex; i <= endColumnIndex; i++) {
            for (int j = startIndex; j <= endIndex; j++) {
                result.add(String.valueOf((char)i) + j);
            }
        }

        return result;
    }
}
