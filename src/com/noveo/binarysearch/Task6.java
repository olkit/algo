package com.noveo.binarysearch;

import com.noveo.Task;

/**
 * @see <a href="https://leetcode.com/problems/binary-search">Problem page</a>
 */
public class Task6 implements Task {

    public void run() {
        int result = search(new int[]{-1,0,3,5,9,12}, 9);
        System.out.println(result);
    }

    public int search(int[] nums, int target) {

        int left = 0, right = nums.length - 1;
        while(left <= right) {
            int indexMid = (left+right) / 2;
            if(nums[indexMid] == target) return indexMid;
            if(nums[indexMid] > target) {
                right = indexMid - 1;
            } else {
                left = indexMid + 1;
            }
        }

        return -1;
    }
}
