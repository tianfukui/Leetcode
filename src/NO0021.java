//Merge two sorted linked lists and return it as a new list.
//The new list should be made by splicing together the nodes of the first two lists.
//Example:
//        Input: 1->2->4, 1->3->4
//        Output: 1->1->2->3->4->4
public class NO0021 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode merge = result;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                merge.next = l1;
                l1 = l1.next;
            }
            else{
                merge.next = l2;
                l2 = l2.next;
            }
            merge = merge.next;
        }
        while(l1 != null){
            merge.next = l1;
            l1 = l1.next;
            merge = merge.next;
        }
        while(l2 != null) {
            merge.next = l2;
            l2 = l2.next;
            merge = merge.next;
        }
        return result.next;
    }
}
