

import java.util.*;
class Solution {
    public int maxSumMinProduct(int[] nums) {
        int n = nums.length;
        long MOD = 1_000_000_007;

        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        Stack<Integer> stack = new Stack<>();
        long max = 0;

        for (int i = 0; i <= n; i++) {
            int curr = (i == n) ? 0 : nums[i];
            while (!stack.isEmpty() && nums[stack.peek()] > curr) {
                int mid = stack.pop();
                int left = stack.isEmpty() ? 0 : stack.peek() + 1;
                long sum = prefix[i] - prefix[left];
                max = Math.max(max, sum * nums[mid]);
            }
            stack.push(i);
        }

        return (int)(max % MOD);
    }
}
