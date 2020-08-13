import ListExercises.ListNode;

import java.util.ArrayList;

public class ListExerciseTest {
    public static ListNode createList(int[] array, int i){
        ListNode<Integer> prev = null;
        if(array.length>0) {
            ListNode<Integer> node = new ListNode(array[i]);
            if (i < array.length - 1) {
                i++;
                prev = ListExerciseTest.createList(array, i);
            }
            node.next = prev;

            return node;
        }else{
            return (new ListNode(null));
        }
    }

    public static Integer[] convertListToArray(ListNode<Integer> l){
        ArrayList<Integer> al = new ArrayList();
        while(l != null){
            al.add(Integer.valueOf(l.value));
            l = l.next;
        }

        Integer[] arr = new Integer[al.size()];
        return al.toArray(arr);
    }
}
