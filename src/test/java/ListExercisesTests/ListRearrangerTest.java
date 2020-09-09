package ListExercisesTests;

import ListExercises.ListNode;
import ListExercises.ListRearranger;
import ListExercisesTests.ListExerciseTest;
import org.junit.Test;

import java.util.Arrays;

public class ListRearrangerTest {

    @Test
    public void ListRearranger_rearrange3ElementsTest(){
        int[] list= new int[] {1, 2, 3, 4, 5};
        int n = 3;
        Integer[] expectedResult =new Integer[]{3, 4, 5, 1, 2};

        assertRearrangeLastN(list, n, expectedResult);
    }

    @Test
    public void ListRearranger_rearrangeLastElementTest(){
        int[] list= new int[] {1, 2, 3, 4, 5, 6, 7};
        int n = 1;
        Integer[] expectedResult =new Integer[]{7, 1, 2, 3, 4, 5, 6};

        assertRearrangeLastN(list, n, expectedResult);
    }

    @Test
    public void ListRearranger_rearrangeZeroElementTest(){
        int[] list= new int[] {1000, -1000};
        int n = 0;
        Integer[] expectedResult =new Integer[]{1000, -1000};

        assertRearrangeLastN(list, n, expectedResult);
    }

    @Test
    public void ListRearranger_rearrangeEmptyListTest(){
        int[] list= new int[] {};
        int n = 0;
        Integer[] expectedResult =new Integer[]{};

        assertRearrangeLastN(list, n, expectedResult);
    }

    @Test
    public void ListRearranger_rearrangeAllElementsTest(){
        int[] list= new int[] {4, -4, 3, 700};
        int n = 4;
        Integer[] expectedResult =new Integer[]{4, -4, 3, 700};

        assertRearrangeLastN(list, n, expectedResult);
    }

    private void assertRearrangeLastN(int[] list, int n, Integer[] expectedResult) {
        ListNode<Integer> listHead = ListExerciseTest.createList(list, 0);
        ListNode<Integer> result = ListRearranger.rearrangeLastN(listHead, n);
        assert (Arrays.equals(ListExerciseTest.convertListToArray(result), expectedResult));
    }

}
