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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        while(l1!=null){
            st1.push(l1.val);
            l1 = l1.next;
        }
        while(l2!=null){
            st2.push(l2.val);
            l2 = l2.next;
        }
        ListNode result = null;
        int carry=0;
        while(!st1.isEmpty() || !st2.isEmpty()){
            int a = 0;
            int b = 0;
            if(!st1.isEmpty()){
                a = st1.pop();
            }
            if(!st2.isEmpty()){
                b = st2.pop();
            }
            int total = a+b+carry;
            ListNode tmp = new ListNode(total%10);
            carry = total/10;

            if(result==null){
                result=tmp;
            }else{
                tmp.next = result;
                result=tmp;
            }
        }
        if(carry!=0){
            ListNode tmp = new ListNode(carry);
            tmp.next = result;
            result=tmp;
        }
        return result;
    }
}