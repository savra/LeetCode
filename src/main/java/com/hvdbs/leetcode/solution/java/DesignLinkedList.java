package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Design Linked List",
        url = "https://leetcode.com/problems/design-linked-list/")
public class DesignLinkedList {
    Node head;
    int length = 0;

    public DesignLinkedList() {
    }

    public int get(int index) {
        Node n = getNode(index);

        if (n == null) {
            return -1;
        } else {
            return n.data;
        }
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
        } else {
            Node tmp = head;
            head = newNode;
            head.next = tmp;
            tmp.prev = head;
        }

        length++;
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
        } else {
            Node cur = head;

            while (cur.next != null) {
                cur = cur.next;
            }

            cur.next = newNode;
            newNode.prev = cur;
        }

        length++;
    }

    public void addAtIndex(int index, int val) {
        if (index == length) {
            addAtTail(val);
            return;
        }

        Node n = getNode(index);

        if (n == null) {
            return;
        }

        if (index == 0) {
            addAtHead(val);
            return;
        }

        Node prev = n.prev;
        Node next = n;


        Node newNode = new Node(val);
        newNode.next = next;
        newNode.prev = prev;

        prev.next = newNode;
        next.prev = newNode;

        length++;
    }

    public void deleteAtIndex(int index) {
        Node n = getNode(index);

        if (n == null) {
            return;
        }

        if (n == head) {
            if (head.next == null) {
                head = null;
            } else {
                head = head.next;
            }

            return;
        }

        if (n.next == null) {
            n.prev.next = null;
        } else {
            n.prev.next = n.next;
            n.next.prev = n.prev;
        }

        length--;
    }


    private Node getNode(int index) {
        int i = 0;

        for (Node cur = head; cur != null; cur = cur.next) {
            if (i == index) {
                return cur;
            }

            i++;
        }

        return null;
    }

    private static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        DesignLinkedList myLinkedList = new DesignLinkedList();
        myLinkedList.addAtHead(7);
        myLinkedList.addAtHead(2);
        myLinkedList.addAtHead(1);
        myLinkedList.addAtIndex(3, 0);
        myLinkedList.deleteAtIndex(2);    // now the linked list is 1->3
        myLinkedList.addAtHead(6);
        myLinkedList.addAtTail(4);
        myLinkedList.get(4);
    }
}
