package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Design Linked List",
        url = "https://leetcode.com/problems/design-linked-list/"
)
public class DesignLinkedList {
    Node head;
    int length = 0;

    public DesignLinkedList() {
    }

    public int get(int index) {
        Node currentNode = head;

        for (int i = 0; currentNode != null; currentNode = currentNode.next, i++) {
            if (index == i) {
                return currentNode.getValue();
            }
        }

        return -1;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
        } else {
            Node tmp = head;
            head = newNode;
            head.next = tmp;
        }

        length++;
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;

            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }

            currentNode.next = newNode;
        }

        length++;
    }

    public void addAtIndex(int index, int val) {
        if (index > length) {
            return;
        }

        if (index == length) {
            addAtTail(val);
            return;
        }

        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
        } else {
            if (index == 0) {
                addAtHead(val);
                return;
            }

            Node currentNode = head, prevNode = null;

            for (int i = 0; currentNode != null; i++, prevNode = currentNode, currentNode = currentNode.next) {
                if (index == i) {
                    newNode.next = currentNode;
                    prevNode.next = newNode;

                    length++;
                    return;
                }
            }
        }

        length++;
    }

    public void deleteAtIndex(int index) {
        if (index > length - 1) {
            return;
        }

        if (index == 0) {
            if (head.next != null) {
                head = head.next;
                length--;
            } else {
                head = null;
                length = 0;
            }

            return;
        }

        Node currentNode = head, prevNode = null;

        for (int i = 0; currentNode != null; i++, prevNode = currentNode, currentNode = currentNode.next) {
            if (index == i) {
                prevNode.next = currentNode.next;
                length--;
                return;
            }
        }

        length--;
    }

    private static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
