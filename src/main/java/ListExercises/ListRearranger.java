package ListExercises;

public class ListRearranger extends ListOperations{
    public static ListNode<Integer> rearrangeLastN(ListNode<Integer> l, int n) {
        int length = getListLength(l);
        ListNode<Integer> rearrangedList = new ListNode(0);
        ListNode<Integer> rearrangedListHead = rearrangedList;
        ListNode<Integer> tempList = new ListNode(0);
        ListNode<Integer> tempListHead = tempList;

        for(int i = 0; i < length-n;i++){
            tempList.next = l;
            tempList = tempList.next;
            l = l.next;
        }
        tempList.next = null;

        while(l != null){
            rearrangedList.next = l;
            rearrangedList = rearrangedList.next;
            l = l.next;
        }
        rearrangedList.next = tempListHead.next;
        return rearrangedListHead.next;
    }
}
