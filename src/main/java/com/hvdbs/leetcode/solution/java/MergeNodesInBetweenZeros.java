package com.hvdbs.leetcode.solution.java;

import java.util.ArrayList;
import java.util.List;

public class MergeNodesInBetweenZeros {
      public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public static ListNode mergeNodes(ListNode head) {
        int accumulator = 0;

        List<Integer> result = new ArrayList<>();

        while (head != null) {
            if (head.val == 0) {
                if (accumulator != 0) {
                    result.add(accumulator);
                    accumulator = 0;
                }
            } else {
                accumulator += head.val;
            }

            head = head.next;
        }

        ListNode root = new ListNode(result.get(0));

        for (int i = 1; i < result.size(); i++) {
            root.next = new ListNode(result.get(i));
            ListNode c = root.next;
            c.next = new ListNode(result.get(i));
        }

        return root;
    }

    public static void main(String[] args) {
          ListNode node = new ListNode(0);
          node.next = new ListNode(1);
          node.next.next = new ListNode(0);
          node.next.next.next = new ListNode(3);
          node.next.next.next.next = new ListNode(0);
          node.next.next.next.next.next = new ListNode(2);
          node.next.next.next.next.next.next = new ListNode(2);
          node.next.next.next.next.next.next.next = new ListNode(0);

        ListNode listNode = mergeNodes(node);
    }
}
