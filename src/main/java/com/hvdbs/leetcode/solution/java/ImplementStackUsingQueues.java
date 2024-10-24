package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayDeque;
import java.util.Queue;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Implement Stack using Queues",
        url = "https://leetcode.com/problems/implement-stack-using-queues/description/",
        spaceComplexity = Complexity.ConstantComplexity.LINEAR,
        timeComplexity = Complexity.ConstantComplexity.LINEAR)
public class ImplementStackUsingQueues {
    class MyStack {
        private Queue<Integer> queue;

        public MyStack() {
            queue = new ArrayDeque<>();
        }

        public void push(int x) {
            queue.offer(x);
        }

        public int pop() {
            int[] tmp = new int[queue.size()];

            for (int i = 0; !queue.isEmpty(); i++) {
                tmp[i] = queue.poll();
            }

            for (int i = 0; i < tmp.length - 1; i++) {
                queue.offer(tmp[i]);
            }

            return tmp[tmp.length - 1];
        }

        public int top() {
            int[] tmp = new int[queue.size()];

            for (int i = 0; !queue.isEmpty(); i++) {
                tmp[i] = queue.poll();
            }

            for (int i = 0; i < tmp.length; i++) {
                queue.offer(tmp[i]);
            }

            return tmp[tmp.length - 1];
        }

        public boolean empty() {
            return queue.isEmpty();
        }
    }
}
