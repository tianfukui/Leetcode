//Given a linked list, remove the n-th node from the end of list and return its head.
//        Example:
//        Given linked list: 1->2->3->4->5, and n = 2.
//        After removing the second node from the end, the linked list becomes 1->2->3->5.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class NO0019 {
    public ListNode removeNthFromEnd(ListNode head, int n){
        ListNode list = new ListNode(0);
        ListNode first = list,second = list;
        first.next = head;
        for(int i = 0; i <= n; i++){
            first = first.next;
        }
        while(first != null){
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return list.next;
    }
}
