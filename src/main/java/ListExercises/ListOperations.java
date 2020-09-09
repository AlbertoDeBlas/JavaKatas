package ListExercises;

import ListExercises.ListNode;

public class ListOperations {

    public static ListNode reverseList(ListNode<Integer> l){

        return reverseNodes(l, getListLength(l));
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

   /* public static int getListLength(ListNode<Integer> counter) {
        int listLength = 0;
        while(counter.next != null){
            listLength++;
            counter = counter.next;
        }
        return listLength;
    }*/

    public static int getListLength(ListNode<Integer> l){
        int listLength = 0;
        while(l != null){
            listLength++;
            l = l.next;
        }
        return listLength;
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
