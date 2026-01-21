//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/submissions/1890727895/


class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        if (m == 0) return 0;

        for (int left = 0; left <= n - m; left++) {

            int j = 0;

            while (j < m && haystack.charAt(left + j) == needle.charAt(j)) {
                j++;
            }

            if (j == m) {
                return left;
            }
        }

        return -1;
    }
}
