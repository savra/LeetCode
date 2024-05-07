package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Add Two Numbers II",
        url = "https://leetcode.com/problems/add-two-numbers-ii/description/?envType=study-plan-v2&envId=programming-skills"
)
public class AddTwoNumbersII {
    public class ListNode {
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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode cur = l1;
        ListNode prev = null;
        ListNode next;

        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        l1 = prev;

        cur = l2;
        prev = null;

        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        l2 = prev;

        ListNode cur1 = l1;
        ListNode cur2 = l2;

        ListNode newHead = new ListNode(-1);
        ListNode curNewHead = newHead;
        newHead.next = curNewHead;

        int memory = 0;

        while (cur1 != null || cur2 != null) {
            int sum1 = cur1 == null ? 0 : cur1.val;
            int sum2 = cur2 == null ? 0 : cur2.val;
            int sum = sum1 + sum2 + memory;

            if (sum < 10) {
                curNewHead.next = new ListNode(sum);
                memory = 0;
            } else {
                curNewHead.next = new ListNode(sum % 10);
                memory = 1;
            }

            if (cur1 != null) {
                cur1 = cur1.next;
            }

            if (cur2 != null) {
                cur2 = cur2.next;
            }

            curNewHead = curNewHead.next;

            if (cur1 == null && cur2 == null && memory == 1) {
                curNewHead.next = new ListNode(memory);
            }
        }

        cur = newHead.next;
        prev = null;

        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }
}
