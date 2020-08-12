package ListExercises;

import ListExercises.ListNode;

public class ListReverse {

    public static ListNode reverseList(ListNode<Integer> l){

        ListNode prev = null;
        ListNode current = l;
        ListNode next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static ListNode copyList(ListNode<Integer> l){
        ListNode copy = new ListNode(l.value);
        copy.next = null;
        ListNode head = l;
        ListNode copyHead = copy;
        while(head.next != null){
            ListNode current = new ListNode(head.next.value);
            current.next = null;
            copy.next = current;
            copy = current;
            head = head.next;

        }

        return copyHead;
    }
}
