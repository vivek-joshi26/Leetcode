//Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
package Easy;

public class LT83 {

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

        public ListNode deleteDuplicates(ListNode head) {
            if (head == null)
                return null;
        /*
        ListNode a = head, b = head.next;
        while(b != null){
            if(a.val == b.val){
                a.next = b.next;
                b = a.next;
            }
            else{
                a = a.next;
                b = b.next;
            }
        }
        */

            ListNode current = head;
            while (current != null & current.next != null){
                if(current.next.val == current.val){
                    current.next = current.next.next;
                }
                else
                    current = current.next;
            }

            return head;

        }

        public void printList(ListNode head){
            ListNode print = head;
            while (print != null){
                System.out.println(print.val);
                print = print.next;
            }
        }

        public static void main(String[] args) {
            ListNode head = new ListNode(2);
            ListNode b = new ListNode(2);
            ListNode c = new ListNode(6);
            head.next = b;
            b.next = c;
            LT83 obj1 = new LT83();
            obj1.printList(head);

            System.out.println(obj1.deleteDuplicates(head));
            obj1.printList(head);

        }

}
