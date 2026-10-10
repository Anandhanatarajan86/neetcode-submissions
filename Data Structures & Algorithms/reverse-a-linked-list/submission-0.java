/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        //edge case when head is null or ListNode contains single element
        if(head == null || head.next ==null){
            return head;
        }
        ListNode currentPointer = head;
        ListNode prev           = null;  
        while(currentPointer!=null){
            //store always next node in temp node for easier manipulation
            ListNode temp = currentPointer.next;
            //then link in reverse direction
            currentPointer.next = prev;
            prev                = currentPointer;
            currentPointer       = temp;

        }
    return prev;    
    }
}
