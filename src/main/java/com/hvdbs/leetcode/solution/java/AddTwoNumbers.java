package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Add Two Numbers",
        url = "https://leetcode.com/problems/add-two-numbers",
        timeComplexity = "O(N)",
        spaceComplexity = "O(1)"
)
public class AddTwoNumbers {
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
        ListNode l3 = new ListNode();

        ListNode cur1 = l1, cur2 = l2, cur3 = l3;
        int a1, a2, a3, sum;
        boolean memory = false;

        while (cur1 != null || cur2 != null) {
            a1 = cur1 == null ? 0 : cur1.val;
            a2 = cur2 == null ? 0 : cur2.val;

            if (memory) {
                a3 = 1;
                memory = false;
            } else {
                a3 = 0;
            }

            sum = a1 + a2 + a3;

            if (sum < 10) {
                cur3.next = new ListNode(sum);
            } else {
                cur3.next = new ListNode(sum % 10);
                memory = true;
            }

            if (cur2 != null) {
                cur2 = cur2.next;
            }

            if (cur1 != null) {
                cur1 = cur1.next;
            }

            cur3 = cur3.next;
        }

        if (memory) {
            cur3.next = new ListNode(1);
        }

        return l3.next;
    }
}
