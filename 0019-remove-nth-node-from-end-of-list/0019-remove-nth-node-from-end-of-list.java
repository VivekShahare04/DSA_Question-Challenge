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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //ListNode dummy = new ListNode(0);
        //dummy.next=head;
        int size = size(head);
        if(n==size){
            return head.next;
        }

        ListNode curr=head;
        for(int i=1;i<size-n;i++){
            curr=curr.next;
        }
        if(curr.next!=null){
            curr.next=curr.next.next;
        }
        return head;
    }
    public int size(ListNode head){
        int size=0;
        ListNode curr = head;
        while(curr!=null){
            size++;
            curr=curr.next;
        }
        return size;
    }
}