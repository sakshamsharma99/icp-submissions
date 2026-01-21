import java.util.*;
class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int k = 1;
        for(int i : nums) {
            if(i == k) {
                k++;
            }
        }
        return k;
    }
}