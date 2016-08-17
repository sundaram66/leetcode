/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head == null) return head;
        
        ListNode first = head;
        ListNode second = head;
        
        while(n-- > 0) {
            second = second.next;
        }
        
        while(second!=null && second.next !=null) {
            second = second.next;
            first = first.next;
        }
        if(second == null) head = head.next;
        else first.next = first.next.next;
        
        return head;
        
    }
}