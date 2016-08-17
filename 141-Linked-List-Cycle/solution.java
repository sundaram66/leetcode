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
 
 // http://stackoverflow.com/questions/2936213/explain-how-finding-cycle-start-node-in-cycle-linked-list-work
 // https://www.quora.com/Why-we-increment-the-fast-pointer-by-two-cant-we-increment-it-by-3-or-4-and-slow-pointer-by-one-to-find-the-existence-of-loop-in-a-singly-linked-list-Any-proof-link-will-be-appreciated
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        if(head == null) return false;
        
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast !=null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        
        return false;
    }
}
