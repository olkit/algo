package com.noveo.array;

import com.noveo.Task;
import com.noveo.model.ListNode;

import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/merge-k-sorted-lists/">Problem page</a>
 */
public class Task13 implements Task {

    public void run() {

        ListNode[] listNodeArray = new ListNode[]{
                new ListNode(1, new ListNode(4, new ListNode(5))),
                new ListNode(1, new ListNode(3, new ListNode(4))),
                new ListNode(2, new ListNode(3))
        };

        ListNode root = mergeKLists(listNodeArray);
        root.print();
    }

    public ListNode mergeKLists(ListNode[] lists) {

        ListNode root = new ListNode(0);
        ListNode pointer = root;

        while(true) {


            ListNode minNode = null;
            int indexMinNode = -1;
            for(int i = 0; i < lists.length; i++) {

                if(lists[i] == null) continue;

                if(minNode == null || minNode.val >= lists[i].val) {
                    minNode = lists[i];
                    indexMinNode = i;
                }
            }

            if(minNode == null) break;
            pointer.next = minNode;
            lists[indexMinNode] = minNode.next;
            pointer = pointer.next;
            pointer.next = null;
        }


        return root.next;
    }
}
