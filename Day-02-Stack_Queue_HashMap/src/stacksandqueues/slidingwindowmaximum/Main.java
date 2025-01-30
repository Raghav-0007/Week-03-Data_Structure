package stacksandqueues.slidingwindowmaximum;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) return new int[0];

        int n = nums.length;
        int[] result = new int[n - k + 1]; // Store max of each window
        Deque<Integer> deque = new LinkedList<>(); // Store indices

        for (int i = 0; i < n; i++) {
            // Remove elements out of the window
            if (!deque.isEmpty() && deque.peekFirst() == i - k) {
                deque.pollFirst();
            }

            // Remove smaller elements as they are useless
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // Add current element index
            deque.offerLast(i);

            // Store the max value in result when the window is full
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] result = maxSlidingWindow(nums, k);
        System.out.println(Arrays.toString(result)); // Output: [3, 3, 5, 5, 6, 7]
    }
}
