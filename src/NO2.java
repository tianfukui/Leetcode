//Add two numbers
//You are given two non-empty linked lists representing two non-negative integers.
//The digits are stored in reverse order and each of their nodes contain a single digit.Add the two numbers and return it as a linked list.
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//Example:
//        Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//        Output: 7 -> 0 -> 8
//        Explanation: 342 + 465 = 807.
class ListNode{
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}
public class NO2 {
    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode head = null;
        ListNode result = null;
        int current = 0;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0){
            current = current + carry;
            if(l1 != null){
                current = current + l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                current = current + l2.val;
                l2 = l2.next;
            }
            carry = current / 10;
            current = current % 10;
            if(result == null){
                result = new ListNode(current);
                head = result;
            }
            else{
                result.next = new ListNode(current);
                result = result.next;
            }
            current = 0;
        }
        return head;
    }
}
