package ListExercisesTests;

import ListExercises.ListNode;
import ListExercises.TwoListMerger;
import ListExercisesTests.ListExerciseTest;
import org.junit.Test;

import java.util.Arrays;

public class TwoListMergerTest extends ListExerciseTest {
    @Test
    public void twoListMerger_withoutCommonValuesTest(){
        int[] firstList= new int[] {1, 2, 3};
        int[] secondList = new int[] {4, 5, 6};
        Integer[] expectedResult =new Integer[]{1, 2, 3, 4, 5, 6};

        assertTwoListMerge(firstList, secondList, expectedResult);
    }



    @Test
    public void twoListMerger_withoutCommonValuesWithRepetitionTest(){
        int[] firstList= new int[] {1, 1, 2, 4};
        int[] secondList = new int[] {0, 3, 5};
        Integer[] expectedResult =new Integer[]{0, 1, 1, 2, 3, 4, 5};

        assertTwoListMerge(firstList, secondList, expectedResult);
    }

    @Test
    public void twoListMerger_emptyAndFirstFilledListTest(){
        int[] firstList = new int[] {1, 1, 2, 2, 4, 7, 7, 8};
        int[] secondList= new int[] {};
        Integer[] expectedResult =new Integer[]{1, 1, 2, 2, 4, 7, 7, 8};

        assertTwoListMerge(firstList, secondList, expectedResult);
    }

    @Test
    public void twoListMerger_emptyAndSecondFilledListTest(){
        int[] firstList= new int[] {};
        int[] secondList = new int[] {1, 1, 2, 2, 4, 7, 7, 8};
        Integer[] expectedResult =new Integer[]{1, 1, 2, 2, 4, 7, 7, 8};

        assertTwoListMerge(firstList, secondList, expectedResult);
    }

    @Test
    public void twoListMerger_singleFilledFirstListTest(){
        int[] firstList= new int[] {0};
        int[] secondList = new int[] {1, 1};
        Integer[] expectedResult =new Integer[]{0, 1, 1};

        assertTwoListMerge(firstList, secondList, expectedResult);
    }

    @Test
    public void twoListMerger_singleFilledBothListsTest(){
        int[] firstList= new int[] {0};
        int[] secondList = new int[] {1};
        Integer[] expectedResult =new Integer[]{0, 1};

        assertTwoListMerge(firstList, secondList, expectedResult);
    }

    @Test
    public void twoListMerger_withNegativesWithoutCommonValuesTest(){
        int[] firstList= new int[] {0};
        int[] secondList = new int[] {-1000000000, 1000000000};
        Integer[] expectedResult =new Integer[]{-1000000000, 0, 1000000000};

        assertTwoListMerge(firstList, secondList, expectedResult);
    }

    @Test
    public void twoListMerger_withCommonNegativesTest(){
        int[] firstList= new int[] {-1, -1, 0, 1};
        int[] secondList = new int[] {-1, 0, 0, 1, 1};
        Integer[] expectedResult =new Integer[]{-1, -1, -1, 0, 0, 0, 1, 1, 1};

        assertTwoListMerge(firstList, secondList, expectedResult);
    }

    @Test
    public void twoListMerger_emptyListsTest(){
        int[] firstList= new int[] {};
        int[] secondList = new int[] {};
        Integer[] expectedResult =new Integer[]{};

        assertTwoListMerge(firstList, secondList, expectedResult);
    }

    @Test
    public void twoListMerger_largeValuesTest(){
        int[] firstList= new int[] {-780990573, -670826849, -404817961, 242026249, 731519938};
        int[] secondList = new int[] {-815817641, -426491047, 437929670, 520408640};
        Integer[] expectedResult =new Integer[]{-815817641, -780990573, -670826849, -426491047, -404817961, 242026249, 437929670, 520408640, 731519938};

        assertTwoListMerge(firstList, secondList, expectedResult);
    }

    private void assertTwoListMerge(int[] firstList, int[] secondList, Integer[] expectedResult) {
        ListNode<Integer> firstListHead = createList(firstList, 0);
        ListNode<Integer> secondListHead = createList(secondList, 0);
        ListNode<Integer> result = TwoListMerger.mergeTwoLinkedLists(firstListHead,secondListHead);
        assert(Arrays.equals(ListExerciseTest.convertListToArray(result),
                expectedResult));
    }


}


