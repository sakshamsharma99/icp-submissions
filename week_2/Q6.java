


import java.util.*;

class Solution {
    public String smallestSubsequence(String s, int k, char letter, int repetition) {
        int n = s.length();
        int countLetter = 0;

        for (char c : s.toCharArray()) {
            if (c == letter) countLetter++;
        }

        Stack<Character> stack = new Stack<>();
        int usedLetter = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            while (!stack.isEmpty()
                && stack.peek() > c
                && stack.size() - 1 + (n - i) >= k
                && (stack.peek() != letter || usedLetter - 1 + countLetter >= repetition)) {

                if (stack.pop() == letter) usedLetter--;
            }

            if (stack.size() < k) {
                if (c == letter) {
                    stack.push(c);
                    usedLetter++;
                } else if (k - stack.size() > repetition - usedLetter) {
                    stack.push(c);
                }
            }

            if (c == letter) countLetter--;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : stack) sb.append(c);
        return sb.toString();
    }
}
