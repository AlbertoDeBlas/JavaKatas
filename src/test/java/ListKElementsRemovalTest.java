import ListExercises.ListKElementsRemoval;
import ListExercises.ListNode;

import org.junit.Test;

import java.util.Arrays;

public class ListKElementsRemovalTest extends ListExerciseTest{

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

}
