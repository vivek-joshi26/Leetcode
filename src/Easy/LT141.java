//Given head, the head of a linked list, determine if the linked list has a cycle in it.
//
//There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer.
// Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
package Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LT141 {

    // Using extra space
    public boolean hasCycle(ListNode head) {
        if( head == null)
            return false;
        Map<ListNode,Integer> map = new HashMap<>();
        while (head.next != null){
            if(map.containsKey(head))
                return true;
            map.put(head,head.hashCode());
            head = head.next;
        }
        return false;
    }

    // Using extra space and hashcode
    public boolean hasCycle2(ListNode head) {
        if( head == null)
            return false;
        Map<Integer,Integer> map = new HashMap<>();
        while (head.next != null){
            if(map.containsKey(head.hashCode()))
                return true;
            map.put(head.hashCode(),head.val);
            head = head.next;
        }
        return false;
    }

    // Using extra space and hashcode and Set
    public boolean hasCycle3(ListNode head) {
        if( head == null)
            return false;
        Set<Integer> set = new HashSet<>();
        while (head.next != null){
            if(set.contains(head.hashCode()))
                return true;
            set.add(head.hashCode());
            head = head.next;
        }
        return false;
    }

    // Without extra space
    public boolean hasCycle4(ListNode head) {
        if( head == null || head.next == null)
            return false;
        ListNode fp = head;
        ListNode sp = head;
        while (fp != null && fp.next != null){
            fp = fp.next.next;
            sp = sp.next;
            if(fp == sp)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        LT141 lt141 = new LT141();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        //head.next.next = new ListNode(3);
        //head.next.next.next = head;
        System.out.println(lt141.hasCycle4(head));
    }

}
