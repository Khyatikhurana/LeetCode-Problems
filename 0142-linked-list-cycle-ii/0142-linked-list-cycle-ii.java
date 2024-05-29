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
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null){
            return null;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        boolean cycle = false;
        
        while(fast != null && fast.next != null ){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                cycle = true;
                break;
            }
        }
        
        if(!cycle){
            return null;
        }
        
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
        
    }
}