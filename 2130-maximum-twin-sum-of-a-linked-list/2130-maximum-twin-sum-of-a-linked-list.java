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
    public int pairSum(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            int x = list.get(i), y = list.get(list.size()-1-i);
            sum = Math.max(sum, x+y);
        }
        return sum;
    }
}