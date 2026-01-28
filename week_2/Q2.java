//https://leetcode.com/problems/make-the-string-great/submissions/1889536152/
//1544. Make The String Great

import java.util.*;
class Solution {
    public String makeGood(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for(char i : s.toCharArray()) {
            if(!stack.isEmpty() && Math.abs(stack.peek()-i) == 32) {
                stack.pop();
            }else {
                stack.push(i);
            }
            
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            sb.append(stack.removeLast());
        }

        return sb.toString();

        
    }
}