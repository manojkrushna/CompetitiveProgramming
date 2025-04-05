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
        ListNode l3 = new ListNode(-1);
        ListNode res = l3;
        int carry = 0;
        while (null != l1 || null != l2){

            int l1_val = 0;
            if(null != l1){
                l1_val = l1.val;
                l1 = l1.next;
            }

            int l2_val = 0;
            if(null != l2){
                l2_val = l2.val;
                l2 = l2.next;
            }

            int sum = l1_val + l2_val + carry;
            l3.next = new ListNode(sum%10);
            carry = sum / 10;
            l3 = l3.next;

            if(carry != 0){
                l3.next = new ListNode(carry);
            }
        }
        return res.next;
    }
}