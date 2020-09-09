package ListExercises;

public class ListNodeReverser extends ListOperations {

    public static ListNode<Integer> reverseNodesInKGroups(ListNode<Integer> l, int k) {
        ListNode<Integer> ReversedList = new ListNode(0);
        ListNode<Integer> ReversedListHead = ReversedList;
        boolean endOfList = false;

        while(l != null && !endOfList){
            ListNode<Integer> ReversedChunk = reverseNodes(copyList(l),k);
            if(ReversedChunk != null){
                appendNodes(ReversedList,ReversedChunk);

                for (int i = 0; i< k;i++){
                    l = l.next;
                    ReversedList = ReversedList.next;
                }
            }else{
                appendNodes(ReversedList,l);
                endOfList = true;
            }
        }

        return ReversedListHead.next;
    }

    public static void appendNodes(ListNode<Integer> l, ListNode<Integer> a){
        while(a != null){
            l.next = a;
            l = l.next;
            a = a.next;
        }

    }
}
