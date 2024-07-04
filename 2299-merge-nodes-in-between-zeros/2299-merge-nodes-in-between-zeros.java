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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        ListNode current = head.next;

        while(current!=null){
            int sum = 0;
            while(current.val!=0 && current!=null){
                sum = sum + current.val;
                current = current.next;
            }
            tail.next = new ListNode(sum);
            tail = tail.next;
            if(current!=null){
                current = current.next;
            }
           
        }
        return dummy.next;
    }
}