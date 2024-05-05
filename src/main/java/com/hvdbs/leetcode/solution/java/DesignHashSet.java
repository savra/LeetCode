package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Design HashSet",
        url = "https://leetcode.com/problems/design-hashset")
public class DesignHashSet {
    class MyHashSet {
        private static final int SIZE = 16;
        private final List<LinkedList<Integer>> buckets = new ArrayList<>(SIZE);

        public MyHashSet() {
            for(int i = 0; i < SIZE; i++) {
                buckets.add(new LinkedList<>());
            }
        }

        public void add(int key) {
            int i = buckets.size() % 16;

            if (buckets.get(i) == null) {
                buckets.add(i, new LinkedList<>());
            }

            if (!buckets.get(i).contains(key)) {
                buckets.get(i).offerLast(key);
            }
        }

        public void remove(int key) {
            int i = buckets.size() % 16;

            if (buckets.get(i) == null) {
                return;
            }

            LinkedList<Integer> integers = buckets.get(i);
            integers.removeFirstOccurrence(key);
        }

        public boolean contains(int key) {
            int i = buckets.size() % 16;

            if (buckets.get(i) == null) {
                return false;
            }

            return buckets.get(i).contains(key);
        }
    }
}
