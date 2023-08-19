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
import java.lang.Math;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode fin; // head
        int carry = 0;
        int sum1;

        if (l1.val + l2.val > 9) {
            fin = new ListNode((l1.val + l2.val)%10);
            carry = 1;
        }
        else {
            fin = new ListNode(l1.val + l2.val);
        }
        l1 = l1.next;
        l2 = l2.next;

        ListNode f = fin; // for traversal

        while (l1 != null && l2 != null) {
            sum1 = l1.val + l2.val + carry;
            if (sum1 > 9) {
                f.next = new ListNode(sum1%10);
                carry = 1;
                f = f.next;
            }
            else {
                f.next = new ListNode(sum1);
                carry = 0;
                f = f.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            sum1 = l1.val + carry;
            if (sum1 > 9) {
                f.next = new ListNode(sum1%10);
                carry = 1;
                f = f.next;
            }
            else {
                f.next = new ListNode(sum1);
                carry = 0;
                f = f.next;
            }
            l1 = l1.next;
        }
        
        while (l2 != null) {
            sum1 = l2.val + carry;
            if (sum1 > 9) {
                f.next = new ListNode(sum1%10);
                carry = 1;
                f = f.next;
            }
            else {
                f.next = new ListNode(sum1);
                carry = 0;
                f = f.next;
            }
            l2 = l2.next;
        }

        if (carry == 1) {
            f.next = new ListNode(1);
        }

        return fin;
    }
}