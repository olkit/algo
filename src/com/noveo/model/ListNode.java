package com.noveo.model;

public class ListNode {
    public int val;
    public int key;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int key, int val) {
        this.key = key;
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(int key, int val, ListNode next) {
        this.key = key;
        this.val = val;
        this.next = next;
    }

    public void print() {
        ListNode pointer = this;
        while(pointer != null) {
            System.out.print(pointer.val);
            pointer = pointer.next;
        }
    }
}
