package com.noveo.hashmap;

import com.noveo.Task;
import com.noveo.model.ListNode;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode.com/problems/design-hashmap/">Problem page</a>
 */
public class Task14 implements Task {
    @Override
    public void run() {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(1, 1); // The map is now [[1,1]]
        myHashMap.put(2, 2); // The map is now [[1,1], [2,2]]
        myHashMap.get(1);    // return 1, The map is now [[1,1], [2,2]]
        myHashMap.get(3);    // return -1 (i.e., not found), The map is now [[1,1], [2,2]]
        myHashMap.put(2, 1); // The map is now [[1,1], [2,1]] (i.e., update the existing value)
        System.out.println(myHashMap.get(2));    // return 1, The map is now [[1,1], [2,1]]
        myHashMap.remove(2); // remove the mapping for 2, The map is now [[1,1]]
        myHashMap.get(2);    // return -1 (i.e., not found), The map is now [[1,1]]
    }


    class MyHashMap {

        private int[] array;
        private final int SIZE = 1000001;

        public MyHashMap() {
            array = new int[SIZE];
            Arrays.fill(array, -1);
        }

        public void put(int key, int value) {
            array[key] = value;
        }

        public int get(int key) {
            return array[key];
        }

        public void remove(int key) {
            array[key] = -1;
        }
    }

    class MyHashMap2 {

        private ListNode[] array;
        private final int SIZE = 16;

        public MyHashMap2() {
            array = new ListNode[SIZE];
        }

        public void put(int key, int value) {
            int index = key % SIZE;
            ListNode node = array[index];
            if(node == null) {
                array[index] = new ListNode(value);
                return;
            }

            while(node != null) {
                if(node.key == key) {
                    node.val = value;
                    return;
                }
                node = node.next;
            }
            array[index] = new ListNode(key, value, array[index]);
        }

        public int get(int key) {
            int index = key % SIZE;
            ListNode node = array[index];
            while(node != null) {
                if(node.key == key) return node.val;
                node = node.next;
            }
            return -1;
        }

        public void remove(int key) {
            int index = key % SIZE;
            ListNode node = array[index];

            if(node == null) return;
            if(node.key == key) array[index] = array[index].next;
            while(node.next != null) {
                if(node.next.key == key) {
                    node.next = node.next.next;
                    return;
                }
                node = node.next;
            }
        }
    }
}
