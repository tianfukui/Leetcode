//Given a linked list, swap every two adjacent nodes and return its head.
//        You may not modify the values in the list's nodes, only nodes itself may be changed.
//        Example:
//        Given 1->2->3->4, you should return the list as 2->1->4->3.
public class NO0024 {
    public ListNode swapPairs(ListNode head){
        ListNode double_list = new ListNode(0);
        double_list.next = head;
        ListNode pre_node = double_list;
        ListNode cur_node = head;
        while(cur_node != null && cur_node.next != null){
            ListNode tmp = cur_node.next;

            cur_node.next = tmp.next;
            pre_node.next = tmp;
            tmp.next = cur_node;

            pre_node = cur_node;
            cur_node = cur_node.next;
        }
        return double_list.next;
    }
}
