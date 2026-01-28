//https://leetcode.com/problems/time-needed-to-buy-tickets/submissions/1898302679/
//2073. Time Needed to Buy Tickets

package week_3;
import java.util.*;
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();
        int n = tickets.length;
        int count = 0;
        for(int i=0; i<n; i++) {
            q.offer(i);
        }

        while(!q.isEmpty()) {
            int idx = q.poll();

            tickets[idx]--;
            count++;

            if(tickets[idx] > 0) {
                q.offer(idx);
            }

            if(idx == k && tickets[idx] == 0) {
                break;
            }
        }
        return count;
    }
}