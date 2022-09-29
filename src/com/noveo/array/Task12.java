package com.noveo.array;

import com.noveo.Task;

/**
 * @see <a href="https://leetcode.com/problems/time-needed-to-buy-tickets/submissions/">Problem page</a>
 */
public class Task12 implements Task {

    public void run() {
        int[] arr = new int[]{2,3,2};
        System.out.println(timeRequiredToBuy(arr, 2));
    }

    public int timeRequiredToBuy(int[] tickets, int k) {

        int count = 0;

        for(int i = 0; i < tickets.length; i++) {

            int low = 100;
            if(i <= k) low = Math.min(tickets[k], tickets[i]);
            if(i > k) low = Math.min(tickets[k] - 1, tickets[i]);

            count += low;
        }
        return count;
    }
}
