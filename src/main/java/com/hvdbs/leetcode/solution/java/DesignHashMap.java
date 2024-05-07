package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Design HashMap",
        url = "https://leetcode.com/problems/design-hashmap")
public class DesignHashMap {
    static class MyHashMap {
        private static final int SIZE = 16;
        private final List<LinkedList<Node>> buckets = new ArrayList<>(SIZE);

        public MyHashMap() {
            for (int i = 0; i < SIZE; i++) {
                buckets.add(new LinkedList<>());
            }
        }

        public void put(int key, int value) {
            LinkedList<Node> list = buckets.get(key % SIZE);

            for (Node n : list) {
                if (n.key == key) {
                    n.value = value;
                    return;
                }
            }

            list.offer(new Node(key, value));
        }

        public int get(int key) {
            LinkedList<Node> list = buckets.get(key % SIZE);

            for (Node n : list) {
                if (n.key == key) {
                    return n.value;
                }
            }

            return -1;
        }

        public void remove(int key) {
            LinkedList<Node> list = buckets.get(key % SIZE);
            list.removeIf(node -> node.key == key);
        }

        private static class Node {
            int key;
            int value;

            public Node(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }
    }
}
