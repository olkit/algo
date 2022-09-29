package com.noveo.array;

import com.noveo.Task;
import com.noveo.model.TreeNode;

/**
 * @see <a href="https://leetcode.com/problems/sort-colors/">Problem page</a>
 */
public class Task11 implements Task {

    public void run() {
        int[] arr = new int[]{2,0,2,1,1,0};
        sortColors(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public void sortColors(int[] nums) {

        final int RED_NUMBER = 0;
        final int WHITE_NUMBER = 1;
        final int BLUE_NUMBER = 2;

        int countRed = 0;
        int countWhite = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == RED_NUMBER) countRed++;
            else if(nums[i] == WHITE_NUMBER) countWhite++;
        }
        for(int i = 0; i < nums.length; i++) {
            if(i < countRed) nums[i] = RED_NUMBER;
            else if(i < countRed + countWhite) nums[i] = WHITE_NUMBER;
            else nums[i] = BLUE_NUMBER;
        }
    }
}
