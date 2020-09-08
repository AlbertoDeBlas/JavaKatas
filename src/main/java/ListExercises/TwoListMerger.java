package ListExercises;

public class TwoListMerger {

    public static ListNode<Integer> mergeTwoLinkedLists(ListNode<Integer> l1, ListNode<Integer> l2) {
        ListNode<Integer> mergedList = new ListNode(0);
        ListNode<Integer> headResult = mergedList;

        while(l1 != null || l2 != null){
            if(l1 != null && l2 != null){
                if(l1.value.compareTo(l2.value) < 0){
                    mergedList = addElementToMergedList(l1, mergedList);
                    l1 = l1.next;
                }else{
                    mergedList = addElementToMergedList(l2, mergedList);
                    l2 = l2.next;
                }
            }else if(l1 != null){
                mergedList = addElementToMergedList(l1, mergedList);
                l1 = l1.next;
            }else if(l2 != null){
                mergedList = addElementToMergedList(l2, mergedList);
                l2 = l2.next;
            }
        }
        return headResult.next;
    }

    private static ListNode<Integer> addElementToMergedList(ListNode<Integer> l2, ListNode<Integer> mergedList) {
        mergedList.next = l2;
        mergedList = l2;
        return mergedList;
    }

    public ListNode<Integer> mergeNode(ListNode<Integer> mergedList, ListNode<Integer> node){
        mergedList = addElementToMergedList(node, mergedList);
        return node.next;
    }
}
