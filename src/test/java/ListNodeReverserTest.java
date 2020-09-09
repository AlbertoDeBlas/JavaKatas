import ListExercises.ListNode;
import ListExercises.ListNodeReverser;
import org.junit.Test;

import java.util.Arrays;

public class ListNodeReverserTest {

    @Test
    public void reverseNodesInKGroups_InPairsTest(){

        int[] myArray = new int[] {1, 2, 3, 4, 5};
        int k = 2;
        Integer[] result = new Integer[] {2, 1, 4, 3, 5};

        reverseNodesInKGroupsAssert(myArray, k, result);
    }

    @Test
    public void reverseNodesInKGroups_OneByOneTest(){

        int[] myArray = new int[] {1, 2, 3, 4, 5};
        int k = 1;
        Integer[] result = new Integer[] {1, 2, 3, 4, 5};

        reverseNodesInKGroupsAssert(myArray, k, result);
    }

    @Test
    public void reverseNodesInKGroups_InThreeWaysTest(){

        int[] myArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int k = 3;
        Integer[] result = new Integer[] {3, 2, 1, 6, 5, 4, 9, 8, 7, 10, 11};

        reverseNodesInKGroupsAssert(myArray, k, result);
    }

    @Test
    public void reverseNodesInKGroups_OneElementTest(){

        int[] myArray = new int[] {11};
        int k = 1;
        Integer[] result = new Integer[] {11};

        reverseNodesInKGroupsAssert(myArray, k, result);
    }

    @Test
    public void reverseNodesInKGroups_PairLengthTest(){

        int[] myArray = new int[] {1, 2, 3, 4};
        int k = 2;
        Integer[] result = new Integer[] {2, 1, 4, 3};

        reverseNodesInKGroupsAssert(myArray, k, result);
    }

    @Test
    public void reverseNodesInKGroups_LargeValuesTest(){

        int[] myArray = new int[] {1000000000, -849483855, -1000000000, 376365554, -847904832};
        int k = 4;
        Integer[] result = new Integer[] {376365554, -1000000000, -849483855, 1000000000, -847904832};

        reverseNodesInKGroupsAssert(myArray, k, result);
    }

    private void reverseNodesInKGroupsAssert(int[] myArray, int k, Integer[] result) {
        ListNode<Integer> head = ListExerciseTest.createList(myArray, 0);
        ListNode<Integer> reversed = ListNodeReverser.reverseNodesInKGroups(head, k);

        assert (Arrays.equals(ListExerciseTest.convertListToArray(reversed), result));
    }


}
