package com.noveo.linkedlist;

import com.noveo.Task;
import com.noveo.model.ListNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @see <a href="https://leetcode.com/problems/add-two-numbers/">Problem page</a>
 */
public class Task16 implements Task {
    @Override
    public void run() {

        ListNode node1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode node2 = new ListNode(1, new ListNode(6, new ListNode(4)));

        ListNode root = addTwoNumbers(node1, node2);
        root.print();
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummyHead = new ListNode();
        ListNode pointer = dummyHead;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0) {

            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            int val3 = val1 + val2 + carry;
            carry = val3 / 10;

            pointer.next = new ListNode(val3 % 10);
            pointer = pointer.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        return dummyHead.next;
    }
}
