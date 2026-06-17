/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) {\ this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        int c = 1;
        ListNode reversedHead = prev; 
        if (n == 1) {
            reversedHead = reversedHead.next;
        }
        else{
        curr = reversedHead;
        prev = null;
        while (curr != null){
            if (c == n){
                prev.next = curr.next;
                break;
            }
            else{
                prev = curr;
                curr = curr.next;
                c++;
            }
        }}
        curr = reversedHead;
        prev = null;
        while (curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}