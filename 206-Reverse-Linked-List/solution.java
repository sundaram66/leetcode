/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head == null) return head;
        
        ListNode curr = head;
        ListNode next = head.next;
        ListNode prev = null;
        
        while(curr != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if(curr != null) 
                next = curr.next;
        }
        
        return prev;
        
    }
}