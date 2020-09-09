import ListExercises.ListNode;
import ListExercises.ListOperations;
import org.junit.Test;

import java.util.Arrays;

public class ListOperationsTest {

    @Test
    public void reverseListTest(){

        int[] myArray = new int[] {3, 1, 2, 3, 4, 5};

        ListNode<Integer> head = ListExerciseTest.createList(myArray, 0);
        ListNode<Integer> reversed = ListOperations.reverseList(head);

        assert(Arrays.equals(ListExerciseTest.convertListToArray(reversed), new Integer[] { 5, 4, 3, 2, 1, 3}));
    }

    @Test
    public void copyListTest(){

        int[] myArray = new int[] {3, 1, 2, 3, 4, 5};

        ListNode<Integer> head = ListExerciseTest.createList(myArray, 0);
        ListNode<Integer> copied = ListOperations.copyList(head);

        assert(Arrays.equals(ListExerciseTest.convertListToArray(head),
                            ListExerciseTest.convertListToArray(copied)));

    }

    @Test
    public void reverseNodesTest(){

        int[] myArray = new int[] {3, 1, 2, 3, 4, 5};

        ListNode<Integer> head = ListExerciseTest.createList(myArray, 0);
        ListNode<Integer> reversed = ListOperations.reverseNodes(head,3);

        assert(Arrays.equals(ListExerciseTest.convertListToArray(reversed), new Integer[] { 2, 1, 3}));
    }

    @Test
    public void reverseNodes_KSmallerThanListLengthTest(){

        int[] myArray = new int[] {3, 1};

        ListNode<Integer> head = ListExerciseTest.createList(myArray, 0);
        ListNode<Integer> reversed = ListOperations.reverseNodes(head,3);

        assert(Arrays.equals(ListExerciseTest.convertListToArray(reversed), new Integer[] { }));
    }

    void printList(ListNode<Integer> l){
        System.out.println("-------list-----");
        while(l != null){
            System.out.println(l.value);
            l = l.next;
        }
    }


}
