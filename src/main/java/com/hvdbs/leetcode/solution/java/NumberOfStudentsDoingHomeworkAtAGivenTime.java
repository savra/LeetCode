package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(difficulty = Difficulty.EASY, name = "Number of Students Doing Homework at a Given Time",
        url = "https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time")
public class NumberOfStudentsDoingHomeworkAtAGivenTime {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int busyStudentCount = 0;

        for (int i = 0; i < startTime.length; i++) {
            if (queryTime >= startTime[i] && queryTime <= endTime[i]) {
                busyStudentCount++;
            }
        }

        return busyStudentCount;
    }
}
