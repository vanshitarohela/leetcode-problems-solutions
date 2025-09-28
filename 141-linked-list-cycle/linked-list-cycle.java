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
        // ListNode curr = new ListNode(head);
        Set<ListNode> ans = new HashSet<>();
        while(head != null) {
            if(ans.contains(head)) {
                return true;
            } else {
                ans.add(head);
            }
            head = head.next;
        }
        return false;
    }
}