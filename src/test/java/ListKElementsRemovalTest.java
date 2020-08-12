import ListExercises.ListKElementsRemoval;
import ListExercises.ListNode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ListKElementsRemovalTest {

    @Test
    public void removeKFromListTest(){
        ListNode<Integer> secondNode = new ListNode(2);

        ListNode<Integer> firstNode = new ListNode(3);
        firstNode.next = secondNode;

        int[] myArray = new int[] {3, 1, 2, 3, 4, 5};

        ListNode<Integer> head = createList(myArray, 0);
        ListKElementsRemoval lr = new ListKElementsRemoval();
        ListNode<Integer> result = lr.removeKFromList(head,3);
        assert(Arrays.equals(convertListToArray(result), new Integer[] { 1, 2, 4, 5}));
    }

    public static ListNode createList(int[] array, int i){
        ListNode<Integer> prev = null;
        ListNode<Integer>  node= new ListNode(array[i]);
        if(i < array.length-1){
            i++;
            prev = createList(array, i);
        }
        node.next = prev;

        return node;
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
