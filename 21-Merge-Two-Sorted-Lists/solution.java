/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode head = l1;
        
        ListNode prevL1 = l1;
        ListNode currL2 = l2;
        
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        if(l1.val > l2.val) {
            l2 = l2.next;
            currL2.next = l1;
            prevL1 = currL2;
            
            head = currL2;
        }
        
        

        while(l1 != null && l2 != null) {
            

            currL2 = l2;

            if(l1.val <= l2.val) {
                prevL1 = l1;
                l1 = l1.next;
            }
            
            else {
                prevL1.next = l2;
                l2 = l2.next;
                currL2.next = l1;
                prevL1 = currL2;
            }
        }
        
        if(l1 == null) 
             prevL1.next = l2;
             
        return head;
    }
    
    
    
}