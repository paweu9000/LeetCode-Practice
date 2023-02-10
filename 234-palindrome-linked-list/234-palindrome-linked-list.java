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
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode root = head;
        while(root != null) {
            list.add(root.val);
            root = root.next;
        }
        List<Integer> list2 = new ArrayList<>(list);
        Collections.reverse(list2);
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) != list2.get(i)) return false;
        }
        return true;
    }
}