/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head == null) return head;
        
        ListNode curr = head;
        int currVal = curr.val;
        ListNode currNext = curr.next;
        
        while(currNext != null){
            if(currVal == currNext.val) {
                currNext = currNext.next;
            }
            else {
                curr.next = currNext;
                curr = currNext;
                currVal = curr.val;
            }
        }
        curr.next = null;
        
        return head;
    }
}