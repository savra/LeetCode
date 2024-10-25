package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayDeque;
import java.util.Deque;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Implement Queue using Stacks",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.LINEAR,
        url = "https://leetcode.com/problems/implement-queue-using-stacks/description"
)
public class ImplementQueueUsingStacks {

    static class MyQueue {
        private final Deque<Integer> stack;
        private final Deque<Integer> secondStack;

        public MyQueue() {
            stack = new ArrayDeque<>();
            secondStack = new ArrayDeque<>();
        }

        public void push(int x) {
            stack.offerFirst(x);
        }

        public int pop() {
            int result = 0;

            while (!stack.isEmpty()) {
                result = stack.pop();

                if (!stack.isEmpty()) {
                    secondStack.offerFirst(result);
                }
            }

            while (!secondStack.isEmpty()) {
                stack.offerFirst(secondStack.pollFirst());
            }

            return result;
        }

        public int peek() {
            int result = 0;

            while (!stack.isEmpty()) {
                result = stack.pop();
                secondStack.offerFirst(result);
            }

            while (!secondStack.isEmpty()) {
                stack.offerFirst(secondStack.pollFirst());
            }

            return result;
        }

        public boolean empty() {
            return stack.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        System.out.println(myQueue.pop());
        System.out.println(myQueue.empty());
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}
