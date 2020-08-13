import ListExercises.ListNode;
import ListExercises.ListPalindromeDecider;
import ListExercises.TwoHugeNumbersAdder;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class TwoHugeNumbersAdderTest extends ListExerciseTest{
    @Test
    public void twoHugeNumberAdder_oneCarryTest(){
        int[] firstSummand = new int[] {9876, 5432, 1999};
        int[] secondSummand = new int[] {1, 8001};

        ListNode<Integer> firstSummandHead = createList(firstSummand, 0);
        ListNode<Integer> secondSummandHead = createList(secondSummand, 0);
        ListNode<Integer> result = TwoHugeNumbersAdder.addTwoHugeNumbers(firstSummandHead,secondSummandHead);
        assert(Arrays.equals(ListExerciseTest.convertListToArray(result),
                new Integer[]{9876, 5434, 0}));
    }

    @Test
    public void twoHugeNumberAdder_withoutCarryTest(){
        int[] firstSummand = new int[] {123, 4, 5};
        int[] secondSummand = new int[] {100, 100, 100};

        ListNode<Integer> firstSummandHead = createList(firstSummand, 0);
        ListNode<Integer> secondSummandHead = createList(secondSummand, 0);
        ListNode<Integer> result = TwoHugeNumbersAdder.addTwoHugeNumbers(firstSummandHead,secondSummandHead);
        assert(Arrays.equals(ListExerciseTest.convertListToArray(result),
                new Integer[]{223, 104, 105}));
    }

    @Test
    public void twoHugeNumberAdder_zeroValuesTest(){
        int[] firstSummand = new int[] {0};
        int[] secondSummand = new int[] {0};

        ListNode<Integer> firstSummandHead = createList(firstSummand, 0);
        ListNode<Integer> secondSummandHead = createList(secondSummand, 0);
        ListNode<Integer> result = TwoHugeNumbersAdder.addTwoHugeNumbers(firstSummandHead,secondSummandHead);
        assert(Arrays.equals(ListExerciseTest.convertListToArray(result),
                new Integer[]{0}));
    }

    @Test
    public void twoHugeNumberAdder_addZeroToListTest(){
        int[] firstSummand = new int[] {1234, 1234, 0};
        int[] secondSummand = new int[] {0};

        ListNode<Integer> firstSummandHead = createList(firstSummand, 0);
        ListNode<Integer> secondSummandHead = createList(secondSummand, 0);
        ListNode<Integer> result = TwoHugeNumbersAdder.addTwoHugeNumbers(firstSummandHead,secondSummandHead);
        assert(Arrays.equals(ListExerciseTest.convertListToArray(result),
                new Integer[]{1234, 1234, 0}));
    }


    @Test
    public void twoHugeNumberAdder_multipleCarriesAddTest(){
        int[] firstSummand = new int[] {9998, 9999, 9999, 9999, 9999, 9999};
        int[] secondSummand = new int[] {1};

        ListNode<Integer> firstSummandHead = createList(firstSummand, 0);
        ListNode<Integer> secondSummandHead = createList(secondSummand, 0);
        ListNode<Integer> result = TwoHugeNumbersAdder.addTwoHugeNumbers(firstSummandHead,secondSummandHead);
        assert(Arrays.equals(ListExerciseTest.convertListToArray(result),
                new Integer[]{9999, 0, 0, 0, 0, 0}));
    }


    @Test
    public void twoHugeNumberAdder_multipleCarriesAndNewNodeAddTest(){
        int[] firstSummand = new int[] {9999, 9999, 9999, 9999, 9999, 9999};
        int[] secondSummand = new int[] {1};

        ListNode<Integer> firstSummandHead = createList(firstSummand, 0);
        ListNode<Integer> secondSummandHead = createList(secondSummand, 0);
        ListNode<Integer> result = TwoHugeNumbersAdder.addTwoHugeNumbers(firstSummandHead,secondSummandHead);
        assert(Arrays.equals(ListExerciseTest.convertListToArray(result),
                new Integer[]{1, 0, 0, 0, 0, 0, 0}));
    }


}
