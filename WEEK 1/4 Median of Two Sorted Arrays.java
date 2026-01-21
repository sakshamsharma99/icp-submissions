class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return solve(nums1, nums2);
    }
    public double solve(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] arr = new int[n+m];
        int i=0, j=0, k=0;
        while (i < n && j < m) {
            if (nums1[i] <= nums2[j]) {
            
                arr[k++] = nums1[i++];
            } else {
                arr[k++] = nums2[j++];
            }
        }

        while (i < n){
            arr[k++] = nums1[i++];
        } 

        while (j < m){
            arr[k++] = nums2[j++];
        }
        int length = n + m;
        if(length % 2 == 1) {
            return arr[length/2];
        }else {
            return ( arr[length/2 - 1] + arr[length/2] ) / 2.0;
        }
    }
}