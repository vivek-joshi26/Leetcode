//Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect.
// If the two linked lists have no intersection at all, return null
/*
1-2
        - 6-7-8
3-4-5
 */
package Easy;

public class LT160 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode l1 = headA;


            while (l1 != null){
                ListNode l2 = headB;
                while (l2 != null){
                    if(l1 == l2)
                        return l1;
                    l2 = l2.next;
                }
                l1 = l1.next;
            }
            return null;
    }

    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        if( headA == null || headB == null)
            return null;
        int l1 = findLength(headA);
        int l2 = findLength(headB);
        int diff = 0;

        ListNode p1 = null, p2 = null;
        if(l1 > l2){
            p1 = headA;
            p2 = headB;
            diff = l1 - l2;
        }
        else {
            p1 = headB;
            p2 = headA;
            diff = l2 - l1;
        }
        while (diff > 0){
            p1 = p1.next;
            diff--;
        }
        while (p1 != null){
            if(p1 == p2)
                return p1;
            p1 = p1.next;
            p2 = p2.next;
        }
        return null;
    }

    public int findLength(ListNode head){
        int count = 0;
        while (head != null){
            count++;
            head = head.next;
        }
        return count;
    }

    public static void main(String[] args) {

        LT160 lt160 = new LT160();

        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);

        ListNode b1 = new ListNode(3);
        ListNode b2 = new ListNode(4);
        ListNode b3 = new ListNode(5);

        ListNode c1 = new ListNode(6);
        ListNode c2 = new ListNode(7);
        ListNode c3 = new ListNode(8);

        a1.next = a2;
        a2.next = c1;
        b1.next = b2;
        b2.next = b3;
        b3.next = c1;
        c1.next = c2; c2.next = c3;

        ListNode intersect = lt160.getIntersectionNode1(a1,b1);
        System.out.println(intersect.val);

    }

}
