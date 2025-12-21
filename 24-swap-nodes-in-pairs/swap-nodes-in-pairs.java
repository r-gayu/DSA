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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prev = dummy;
        while(head!=null && head.next!=null){
            ListNode first = head;
            ListNode second = head.next;

            //swapping of nodes dummy -> 1 -> 2 -> 3 -> 4 -> null
            prev.next = second;         //dummy -> 2
            first.next = second.next;   //1 -> 3
            second.next = first;        //2 -> 1     so after first iteration the list becomes 
                                                     // dummy -> 2 -> 1 -> 3 -> 4 -> null
            //move the pointers forward
            prev = first;
            head = first.next;
        }
        return dummy.next;
    }
}