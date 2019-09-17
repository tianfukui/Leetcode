/*  Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
    k is a positive integer and is less than or equal to the length of the linked list.
    If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.
 Example:
        Given this linked list: 1->2->3->4->5
        For k = 2, you should return: 2->1->4->3->5
        For k = 3, you should return: 3->2->1->4->5public class NO0025 {*/
public class NO0025{
    //时间复杂度O(),空间复杂度O()
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null || k < 2) return head;
        ListNode res = new ListNode(0);
        res.next = head;
        int count;
        ListNode prev = res, tail = res, temp;
        while(true){
            count = k;
            while(count > 0 && tail != null) {
                count--;
                tail = tail.next;
            }
            if(tail == null) break;
            head = prev.next;
            while(prev.next != tail){
                temp = prev.next;
                prev.next = temp.next;
                temp.next = tail.next;
                tail.next = temp;
            }
            prev = head;
            tail = head;
        }
        return res.next;
    }
}