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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        
        if(head==null){
            return dummy.next;
        }
        else{
            tail.next = head;
            tail = tail.next;
        }
        
        while(true){
         if(head==null){
             break;
         }
        
         if(head.val!= tail.val){
             tail.next = head;
             head = head.next;
             tail = tail.next;
         }
         else{
             head = head.next;
         }
         
        }
        tail.next = null;
        return dummy.next;
    }
}