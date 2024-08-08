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
    public ListNode reverseBetween(ListNode head, int left, int right) {
       ListNode dummy = new ListNode(0);
       dummy.next=head;

       if(head==null){
        return head;
       }
       ListNode prev = dummy;
       for(int i=1;i<left;i++){
        prev=prev.next;
       }

       ListNode start = prev.next;
       ListNode end = start.next;
       for(int i=0;i<right-left;i++){
        start.next=end.next;
        end.next=prev.next;
        prev.next=end;
        end=start.next;
       }
       return dummy.next;
    }
}