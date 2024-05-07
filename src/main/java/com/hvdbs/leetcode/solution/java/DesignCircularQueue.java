package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Design Circular Queue",
        url = "https://leetcode.com/problems/design-circular-queue")
public class DesignCircularQueue {
    class MyCircularQueue {
        int[] arr;
        int front = -1;
        int tail = -1;
        int length;

        public MyCircularQueue(int k) {
            arr = new int[k];
            length = k - 1;
        }

        public boolean enQueue(int value) {
            if (isEmpty()) {
                arr[0] = value;
                front++;
                tail++;
            } else {
                if (!isFull()) {
                    if (tail < length) {
                        arr[++tail] = value;
                    } else {
                        tail = 0;
                        arr[tail] = value;
                    }
                } else {
                    return false;
                }
            }

            return true;
        }

        public boolean deQueue() {
            if (isEmpty()) {
                return false;
            }

            if (front == tail) {
                front = -1;
                tail = -1;
            } else if (front < length) {
                front++;
            } else {
                front = 0;
            }

            return true;
        }

        public int Front() {
            if (front == -1) {
                return front;
            }

            return arr[front];
        }

        public int Rear() {
            if (tail == -1) {
                return tail;
            }

            return arr[tail];
        }

        public boolean isEmpty() {
            return tail == -1 && front == -1;
        }

        public boolean isFull() {
            return (tail == length && front == 0) || (front == tail + 1);
        }
    }
}
