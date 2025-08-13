package Platinum_Codes;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class MaxSlidingWindow {
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] result = maxSlidingWindow(nums, k);
        for (int val : result) {
            System.out.print(val + " ");
        }
    }

    static int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            // Remove indices out of current window
            if (!dq.isEmpty() && dq.peekFirst() == i - k) {
                dq.removeFirst();
            }
            // Remove smaller numbers from the back
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.removeLast();
            }
            // Add current index
            dq.addLast(i);
            // Add to result once first window is formed
            if (i >= k - 1) {
                list.add(nums[dq.peekFirst()]);
            }
        }

        // Convert ArrayList to int[]
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
