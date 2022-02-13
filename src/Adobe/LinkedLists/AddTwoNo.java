package Adobe.LinkedLists;
/*
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
 */

public class AddTwoNo {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0, sum = 0;

        if(l1 == null)
            return l2;
        if( l2 == null)
            return l1;

        ListNode result = new ListNode();
        ListNode pointer = new ListNode();
        result = pointer;

        while (l1 != null && l2 != null){
            int val1 = l1.val;
            int val2 = l2.val;
            sum = val1 + val2 + carry;
            carry = sum / 10;
            sum = sum % 10;
            ListNode temp = new ListNode(sum);
            pointer.next = temp;
            pointer = pointer.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null){
            int val1 = l1.val;
            sum = val1 + carry;
            carry = sum / 10;
            sum = sum % 10;
            ListNode temp = new ListNode(sum);
            pointer.next = temp;
            pointer = pointer.next;
            l1 = l1.next;
        }
        while (l2 != null){
            int val2 = l2.val;
            sum = val2 + carry;
            carry = sum / 10;
            sum = sum % 10;
            ListNode temp = new ListNode(sum);
            pointer.next = temp;
            pointer = pointer.next;
            l2 = l2.next;
        }
        if( carry > 0){
            ListNode temp = new ListNode(carry);
            pointer.next = temp;
            pointer = pointer.next;
        }

        return result.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        //ListNode l2 = new ListNode(4);
        //ListNode l3 = new ListNode(3);
        //l1.next = l2;
        //l2.next = l3;

        ListNode t1 = new ListNode(1);
        ListNode t2 = new ListNode(9);
        ListNode t3 = new ListNode(9);
        ListNode t4 = new ListNode(9);
        ListNode t5 = new ListNode(9);
        ListNode t6 = new ListNode(9);
        ListNode t7 = new ListNode(9);
        ListNode t8 = new ListNode(9);
        ListNode t9 = new ListNode(9);
        ListNode t10 = new ListNode(9);
        t1.next = t2;
        t2.next = t3;
        t3.next = t4;
        t4.next = t5;
        t5.next = t6;
        t6.next = t7;
        t7.next = t8;
        t8.next = t9;
        t9.next = t10;

        AddTwoNo addTwoNo = new AddTwoNo();
        ListNode result = addTwoNo.addTwoNumbers(l1,t1);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }


}
