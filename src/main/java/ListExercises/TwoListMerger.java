package ListExercises;

public class TwoListMerger {

    public static ListNode<Integer> mergeTwoLinkedLists(ListNode<Integer> l1, ListNode<Integer> l2) {
        ListNode<Integer> mergedList = new ListNode(0);
        ListNode<Integer> headResult = mergedList;

        while(l1 != null || l2 != null){

            if(l1 != null && l2 != null){
                if(l1.value.compareTo(l2.value) < 0){
                    mergedList.next = l1;
                    mergedList = l1;
                    l1 = l1.next;
                }else{
                    mergedList.next = l2;
                    mergedList = l2;
                    l2 = l2.next;
                }
            }else if(l1 != null){
                mergedList.next = l1;
                mergedList = l1;
                l1 = l1.next;
            }else if(l2 != null){
                mergedList.next = l2;
                mergedList = l2;
                l2 = l2.next;
            }

        }

        return headResult.next;

    }

    public ListNode<Integer> mergeNode(ListNode<Integer> mergedList, ListNode<Integer> node){
        mergedList.next = node;
        mergedList = node;
        return node.next;
    }
}
