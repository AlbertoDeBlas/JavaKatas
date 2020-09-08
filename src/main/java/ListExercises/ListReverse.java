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

    public static ListNode reverseNodes(ListNode<Integer> l, int k){

        ListNode<Integer> prev = null;

        ListNode<Integer> current = new ListNode(l.value);
        current.next = l.next;
        ListNode<Integer> next;
        int i = 0;
        while (current != null && i < k) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            i++;
        }

        if(i<k){
            return null;
        }else{
            return prev;
        }
    }

    public static ListNode copyList(ListNode<Integer> l){
        ListNode copy = new ListNode(l.value);
        copy.next = null;
        ListNode head = l;
        ListNode copyHead = copy;
        while(head.next != null){
            copy = getListNode(copy, head);
            head = head.next;
        }
        return copyHead;
    }

    private static ListNode getListNode(ListNode copy, ListNode head) {
        ListNode current = new ListNode(head.next.value);
        current.next = null;
        copy.next = current;
        copy = current;
        return copy;
    }
}
