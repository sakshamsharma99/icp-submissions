//https://leetcode.com/problems/minimum-string-length-after-removing-substrings/submissions/1894004948/
//2696. Minimum String Length After Removing Substrings

import java.util.*;
class Solution {
    public int minLength(String s) {
        Stack<Character> st = new Stack<>();

        for(char i : s.toCharArray()) {
            if(!st.isEmpty()) {
                char temp = st.peek();
                if(temp == 'A' && i == 'B' || temp=='C' && i == 'D') {
                    st.pop();
                    continue;
                }
            }
            st.push(i);
        }
        return st.size();
    }
}