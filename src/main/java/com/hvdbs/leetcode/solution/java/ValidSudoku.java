package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@CodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Valid Sudoku",
        url = "https://leetcode.com/problems/valid-sudoku",
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        timeComplexity = Complexity.ConstantComplexity.CONSTANT
)
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> row = new HashSet<>();
        Map<Integer, Set<Character>> columns = new HashMap<>();
        Map<Integer, Set<Character>> areas = new HashMap<>();

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                char curElem = board[i][j];

                if(curElem == '.') {
                    continue;
                }

                if (row.contains(curElem)) {
                    return false;
                }

                row.add(curElem);

                if (columns.containsKey(j)) {
                    Set<Character> curColumn = columns.get(j);

                    if (curColumn.contains(curElem)) {
                        return false;
                    }

                    curColumn.add(curElem);
                } else {
                    Set<Character> curColumn = new HashSet<>();
                    curColumn.add(curElem);
                    columns.put(j, curColumn);
                }

                int areaIndex = (i / 3) * 3 + (j / 3);

                if (areas.containsKey(areaIndex)) {
                    Set<Character> curArea = areas.get(areaIndex);

                    if (curArea.contains(curElem)) {
                        return false;
                    }

                    curArea.add(curElem);
                } else {
                    Set<Character> curArea = new HashSet<>();
                    curArea.add(curElem);
                    areas.put(areaIndex, curArea);
                }
            }

            row.clear();
        }

        return true;
    }
}
