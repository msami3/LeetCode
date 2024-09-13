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
    public boolean hasCycle(ListNode head) {
        boolean ans = false;
        ListNode p1 = head;
        ListNode p2 = head;
        int pos = -1;
        
        boolean firstpart = true;
        
        if(head==null){
            return false;
        }
        
        while(head.next!=null){
            if(firstpart){
                if(p1.next==null){
                    break;
                }
                else{ 
                    p1 = p1.next;
                }
            }
            if(p1.next==null){
                break;
            }
            else{
              p1 = p1.next;  
            }
            p2 = p2.next;
            if(p1==p2&&firstpart){
                firstpart=false;
                p1 = head;
                ans = true;
            }
            
            if(!firstpart){
                pos+=1;
            }
            
            if(p1 == p2){
                break;
            }
            
        }
        return ans;
    }
}