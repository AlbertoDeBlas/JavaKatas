package ArrayExercisesTests;

import ArrayExercises.DuplicateFinder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DuplicateFinderTest {

    @Test
    public void duplicateFinder_twoDuplicatedValues(){
        int[] array= new int[] {2, 1, 3, 5, 3, 2};
        int expectedResult =3;

        assertDuplicate(array, expectedResult);
    }

    @Test
    public void duplicateFinder_onlyTheDuplicatedValue(){
        int[] array= new int[] {2, 2};
        int expectedResult =2;

        assertDuplicate(array, expectedResult);
    }

    @Test
    public void duplicateFinder_withoutDuplicatedValuesWithMultipleElements(){
        int[] array= new int[] {2, 4, 3, 5, 1};
        int expectedResult =-1;

        assertDuplicate(array, expectedResult);
    }

    @Test
    public void duplicateFinder_withoutDuplicatedValuesOneElement(){
        int[] array= new int[] {1};
        int expectedResult =-1;

        assertDuplicate(array, expectedResult);
    }

    @Test
    public void duplicateFinder_sameValueRepeatedSeveralTimes(){
        int[] array= new int[] {5, 5, 5, 5, 5};
        int expectedResult = 5;

        assertDuplicate(array, expectedResult);
    }

    @Test
    public void duplicateFinder_firstElementDuplicated(){
        int[] array= new int[] {1, 1, 2, 2, 1};
        int expectedResult = 1;

        assertDuplicate(array, expectedResult);
    }

    private void assertDuplicate(int[] array, int expectedResult) {
        int result = DuplicateFinder.firstDuplicate(array);
        assertEquals(result, expectedResult);
    }
}
