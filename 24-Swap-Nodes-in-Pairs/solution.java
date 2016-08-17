/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        
        if(head == null || head.next == null) return head;
        
        ListNode fNode = head;
        ListNode nNode = fNode.next;
        head = head.next;
        ListNode prevEnd = fNode;
        
        
        while(nNode != null && nNode.next != null) {
            fNode.next = nNode.next;
            nNode.next = fNode;
            fNode = fNode.next;
            nNode = fNode.next;
            if(nNode == null) {
                fNode.next = nNode;
                return head;
            }
            prevEnd.next = nNode;
            prevEnd = fNode;
        }

        
        if(nNode != null && nNode.next == null) {
            nNode.next = fNode;
            prevEnd.next = nNode;
            fNode.next = null;
        }
        
        return head;
    }
}