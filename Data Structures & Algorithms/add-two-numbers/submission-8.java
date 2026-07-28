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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1.val == 0 && l2.val == 0) return new ListNode(0);
        ListNode temp1 = l1, temp2 = l2, l3;
        int sum = 0, c = 0, d = 0;
        sum = temp1.val + temp2.val;
        d = sum % 10;
        c = sum / 10;
        l3 = new ListNode(d);
        ListNode h = l3;
        temp1 = temp1.next;
        temp2 = temp2.next;
        while (temp1 != null && temp2 != null){
            sum = c + temp1.val + temp2.val;
            d = sum % 10;
            c = sum / 10;
            h.next = new ListNode(d);
            h = h.next;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        if (temp1 != null){
            while (temp1 != null){sum = c + temp1.val;
            d = sum % 10;
            c = sum / 10;
            h.next = new ListNode(d);
            h = h.next;
            temp1 = temp1.next;}
        }
        else if (temp2 != null){
            while (temp2 != null){sum = c + temp2.val;
            d = sum % 10;
            c = sum / 10;
            h.next = new ListNode(d);
            h = h.next;
            temp2 = temp2.next;}
        }
        if (c != 0) h.next = new ListNode(c);
        return l3;
    }
}
