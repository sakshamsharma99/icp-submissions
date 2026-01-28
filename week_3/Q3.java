//https://leetcode.com/problems/minimum-operations-to-make-binary-array-elements-equal-to-one-i/submissions/1898460583/
//3191. Minimum Operations to Make Binary Array Elements Equal to One I


package week_3;
class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i=0; i<=n-3; i++) {
            if(nums[i] == 0) {
                nums[i] ^= 1;
                nums[i+1] ^= 1;
                nums[i+2] ^= 1;
                count++;
            }
        }

        for(int i : nums) {
            if(i == 0) {
                return -1;
            }
        }

        return count;
    }
}