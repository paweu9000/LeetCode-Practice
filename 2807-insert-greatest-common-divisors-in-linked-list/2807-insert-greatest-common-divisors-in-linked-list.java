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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode node = head;
        while(node.next != null){
            ListNode temp = node.next;
            node.next = new ListNode(gD(node.val, node.next.val));
            node.next.next = temp;
            node = temp;
        }
        return head;
    }
    
    public int gD(int first, int second) {
        if (second == 0) return first;
        return gD(second, first % second);
    }
}