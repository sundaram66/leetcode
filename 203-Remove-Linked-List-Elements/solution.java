/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        if(head == null) return head;
        
        ListNode curr = head;
        ListNode prev = null;
        

        while(curr != null) {
            
            if(curr.val == val) {
                if(prev !=null) prev.next = curr.next;
            }
            
            else {
                if(prev == null) head = curr;
                prev = curr;
            }
                
            curr = curr.next;
            
        }
        if(prev == null) return null;
        return head;
    }
}