package com.noveo.binarysearch;

import com.noveo.Task;
import com.noveo.model.TreeNode;

/**
 * @see <a href="https://leetcode.com/problems/binary-search">Problem page</a>
 */
public class Task7 implements Task {

    public void run() {
        int result;

        result = search(new int[]{5, 1, 3}, 5);
        System.out.println("0 = " + result);

        result = search(new int[]{1, 3}, 10);
        System.out.println("-1 = " + result);

        result = search(new int[]{5, 1, 3}, 1);
        System.out.println("1 = " + result);

        result = search(new int[]{2, 1}, 1);
        System.out.println("1 = " + result);

        result = search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0);
        System.out.println("4 = " + result);
    }

    public int search(int[] nums, int target) {
        int shift = findShift(nums);

        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            int middleIndex = (middle + shift) % nums.length;
            if (nums[middleIndex] == target) return middleIndex;
            if (nums[middleIndex] > target) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }

    public int findShift(int[] nums) {

        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;

            if (middle < right && nums[middle + 1] < nums[middle]) return middle + 1;
            if (middle > left && nums[middle] < nums[middle - 1]) return middle;

            if (nums[left] > nums[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return 0;
    }
}
