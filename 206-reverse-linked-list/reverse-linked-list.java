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
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        /*
        aage hi jaa sakte hai prev wala concept nahi hai 
        1 se 2 par gaye 1 ko ek var1 mai store kia aur phir 2.next mai 1 daal dia
        original 2.next ko var2 mai save kia modify karne se pehle
        phir 2 ko var1 mai daala
        var2.next var1 wale ko daala aur original phir save kar lia
        phir 3 ko var1 mai daala
        */

        ListNode var1 = head;
        ListNode original_next = var1.next;
        var1.next = null;
        
        while (original_next != null) {
            ListNode prev_var = var1;
            var1 = original_next;
            original_next = var1.next;
            var1.next = prev_var;
            head = var1;
        }
        return head;
    }
}