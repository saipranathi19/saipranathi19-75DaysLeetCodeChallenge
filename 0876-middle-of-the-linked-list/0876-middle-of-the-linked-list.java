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
    public ListNode middleNode(ListNode head) {
        ListNode i=head;
        ListNode j = head;
        while(i!=null&&i.next!=null)
        {
            i=i.next.next;
            j=j.next;
        }
        return j;
    }
}