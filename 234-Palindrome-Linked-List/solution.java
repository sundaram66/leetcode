/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        
        if(head == null) return true;
        ListNode fHead = head;
        
        ListNode middle = getMiddle(head);
        ListNode sHead = middle.next;
        sHead = reverseList(sHead);
        
        while(sHead != null) {
            if(fHead.val != sHead.val) {
                return false;
            }
            fHead = fHead.next;
            sHead = sHead.next;
        }
        
        return true;
    }
    
    public ListNode getMiddle(ListNode head) {
        if(head == null) return head;
        
        ListNode slow = head,fast = head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    
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