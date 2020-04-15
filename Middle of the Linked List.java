/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode[] ln = new ListNode[100];
        int i = 0;
        while (head.next != null) {
            ln[i++] = head;
            head = head.next;
        }
        if (i==0 || i==1) {
            return head;
        }
        if (i%2==0) {
            return ln[i/2];
        }
        return ln[(i+1)/2];
    }
}