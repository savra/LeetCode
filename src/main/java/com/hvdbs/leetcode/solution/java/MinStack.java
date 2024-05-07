package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.List;

@CodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Min Stack",
        url = "https://leetcode.com/problems/min-stack")
public class MinStack {
    private static class Node {
        int value;
        int min;

        Node(int value, int min) {
            this.value = value;
            this.min = min;
        }
    }

    List<Node> list;

    public MinStack() {
        list = new ArrayList<>();
    }

    public void push(int val) {
        Node newNode;

        if (list.isEmpty()) {
            newNode = new Node(val, val);
        } else {
            Node last = peek();
            if (val < last.min) {
                newNode = new Node(val, val);
            } else {
                newNode = new Node(val, last.min);
            }
        }

        list.add(newNode);
    }

    public void pop() {
        list.remove(list.size() - 1);
    }

    public int top() {
        return list.get(list.size() - 1).value;
    }

    public int getMin() {
        Node last = peek();

        return last.min;
    }

    private Node peek() {
        return list.get(list.size() - 1);
    }
}
