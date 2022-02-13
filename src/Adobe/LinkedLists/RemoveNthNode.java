package Adobe.LinkedLists;
/*
Given the head of a linked list, remove the nth node from the end of the list and return its head.
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
 */


public class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode temp = head;
        int i = 1;

        ListNode sizeNode = head;
        int size = 0;
        while (sizeNode != null){
            size++;
            sizeNode = sizeNode.next;
        }

        if( size == n)
            return head.next;

        while (i != n + 1){
            fast = fast.next;
            i++;
        }

        while (fast.next != null){
            fast = fast.next;
            head = head.next;
        }
        head.next = head.next.next;
        return temp;
    }

    public static void main(String[] args) {

    }

}
