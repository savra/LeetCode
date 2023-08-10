package com.hvdbs.leetcode.solution.java;

public class InsertGreatestCommonDivisorsInLinkedList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static int gcdByEuclidsAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }

        return gcdByEuclidsAlgorithm(n2, n1 % n2);
    }

    public static ListNode insertGreatestCommonDivisors(ListNode head) {
        while (head != null) {
            if (head.next != null) {
                ListNode newNode = new ListNode(gcdByEuclidsAlgorithm(head.val, head.next.val));

                head.next = newNode;
                newNode.next = head.next.next;
                head = head.next.next;
                continue;
            }

            head = head.next;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(18);
        ListNode listNode2 = new ListNode(6);
        ListNode listNode3 = new ListNode(10);
        ListNode listNode4 = new ListNode(3);

        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        insertGreatestCommonDivisors(listNode);
    }
}
