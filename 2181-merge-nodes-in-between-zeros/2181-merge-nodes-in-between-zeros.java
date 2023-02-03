/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode first = head;
        ListNode dummy = head.next;
        int sum = 0;
        while(dummy.next != null) {
            sum += dummy.val;
            if(dummy.next.val == 0) {
                first.val = sum;
                if(dummy.next.next!= null) first = first.next;
                sum = 0;
            }
            dummy = dummy.next;
        }
        first.next = null;
        return head;
    }
}