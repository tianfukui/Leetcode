import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
//Example:
//        Input:
//        [
//        1->4->5,
//        1->3->4,
//        2->6
//        ]
//        Output: 1->1->2->3->4->4->5->6
public class NO0023 {
    public ListNode mergeKLists_BruteForce(ListNode[] lists) {
        List<Integer> res = new ArrayList<>();
        ListNode head = new ListNode(0);
        ListNode point = head;
        for(ListNode tmp: lists){
            while(tmp != null){
                res.add(tmp.val);
                tmp = tmp.next;
            }
        }
        Collections.sort(res);
//      res.sort(Integer::compareTo);
        for(int x:res){
            point.next = new ListNode(x);
            point = point.next;
        }
        point.next = null;
        return head.next;
    }
    public ListNode mergeKLists_compare_one_by_one(ListNode[] lists){
        ListNode head = new ListNode(0);
        ListNode point = head;
        int min_index = 0;
        while(true){
            boolean flag = true;
            int min_val = Integer.MAX_VALUE;
            for(int i = 0; i < lists.length; i++){
                if(lists[i] != null){
                    if(lists[i].val < min_val){
                        min_index = i;
                        min_val = lists[i].val;
                    }
                    flag = false;
                }
            }
            if(flag) break;
            point.next = new ListNode(lists[min_index].val);
            point = point.next;
            lists[min_index] = lists[min_index].next;
        }
        point.next = null;
        return head.next;
    }
    public ListNode mergeKLists_merge_one_by_one(ListNode[] lists){
        if(lists.length == 0) return null;
        if(lists.length == 1) return lists[0];
        ListNode head = mergeTwoLists(lists[0], lists[1]);
        for(int i = 2; i < lists.length; i++){
            head = mergeTwoLists(head,lists[i]);
        }
        return head;
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode ret = new ListNode(0);
        ListNode point = ret;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                point.next = l1;
                l1 = l1.next;
            }
            else{
                point.next = l2;
                l2 = l2.next;
            }
            point = point.next;
        }
        while(l1 != null){
            point.next = l1;
            l1 = l1.next;
            point = point.next;
        }
        while(l2 != null){
            point.next = l2;
            l2 = l2.next;
            point = point.next;
        }
        return ret.next;
    }

}
