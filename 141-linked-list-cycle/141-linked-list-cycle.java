/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode single = head;
        ListNode doublee = head;
        
        while(doublee != null && doublee.next != null) {
            single = single.next;
            doublee = doublee.next.next;
            if(single == doublee) return true;
        }
        return false;
    }
}