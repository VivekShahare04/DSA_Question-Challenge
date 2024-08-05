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
    public int getDecimalValue(ListNode head) {
        ListNode curr  = head;
        ArrayList<Integer> list = new ArrayList<>();
        while(curr!=null){
            list.add(curr.val);
            curr=curr.next;
        }
        Collections.reverse(list);
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum = sum + (int) Math.pow(2,i)*list.get(i);
        }
        return sum;
    }
}