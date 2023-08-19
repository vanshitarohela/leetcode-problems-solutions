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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // ListNode fin = new ListNode();
        // ListNode list1 = list1;
        // ListNode list2 = list2;

        if (list1 == null) {
            return list2;
        }
        else if (list2 == null) {
            return list1;
        }
        ListNode fin1;
        ListNode fin;

        if (list1.val < list2.val) {
            fin1 = list1;
            list1 = list1.next;
        }
        else {
            fin1 = list2;
            list2 = list2.next;
        }

        fin = fin1;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                fin.next = list1;
                fin = fin.next;
                list1 = list1.next;
            }
            else if (list2.val < list1.val) {
                fin.next = list2;
                fin = fin.next;
                list2 = list2.next;
            }
            else {
                fin.next = list1;
                fin = fin.next;
                list1 = list1.next;
                fin.next = list2;
                fin = fin.next;
                list2 = list2.next;
            }
        }

        if (list1 == null) {
            while (list2 != null) {
                fin.next = list2;
                fin = fin.next;
                list2 = list2.next;
            }
        }
        else if (list2 == null) {
            while (list1 != null) {
                fin.next = list1;
                fin = fin.next;
                list1 = list1.next;
            }
        }
        return fin1;
    }
}