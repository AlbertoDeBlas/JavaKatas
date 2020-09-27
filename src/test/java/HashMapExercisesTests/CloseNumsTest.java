package HashMapExercisesTests;

import HashMapExercises.CloseNums;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CloseNumsTest {

    @Test
    public void closeNums_neighbourNumsOneRepetitionTest(){
        int[] nums = new int[]{1, 0, 0, 1};
        int k = 2;

        assertEquals(CloseNums.containsCloseNums(nums,k),true);
    }

    @Test
    public void closeNums_oneRepetitionFarTest(){
        int[] nums = new int[]{1, 0, 1};
        int k = 1;

        assertEquals(CloseNums.containsCloseNums(nums,k),false);
    }

    @Test
    public void closeNums_oneRepetitionCloseTest(){
        int[] nums = new int[]{1, 0, 1};
        int k = 2;

        assertEquals(CloseNums.containsCloseNums(nums,k),true);
    }

    @Test
    public void closeNums_emptyListTest(){
        int[] nums = new int[]{};
        int k = 0;

        assertEquals(CloseNums.containsCloseNums(nums,k),false);
    }

    @Test
    public void closeNums_withoutRepetitionTest(){
        int[] nums = new int[]{1,2,3,4};
        int k = 2;

        assertEquals(CloseNums.containsCloseNums(nums,k),false);
    }

    @Test
    public void closeNums_multipleRepetitionCloseTest(){
        int[] nums = new int[]{1, 0, 1, 1};
        int k = 1;

        assertEquals(CloseNums.containsCloseNums(nums,k),true);
    }

    @Test
    public void closeNums_multipleRepetitionFarTest(){
        int[] nums = new int[]{1, 0, 2, 1, 0, 1};
        int k = 1;

        assertEquals(CloseNums.containsCloseNums(nums,k),false);
    }

    @Test
    public void closeNums_zeroDistanceTest(){
        int[] nums = new int[]{1, 2, 2, 1, 0, 1};
        int k = 0;

        assertEquals(CloseNums.containsCloseNums(nums,k),false);
    }

    @Test
    public void closeNums_singleValueListTest(){
        int[] nums = new int[]{11};
        int k = 1;

        assertEquals(CloseNums.containsCloseNums(nums,k),false);
    }

    @Test
    public void closeNums_negativeValueUniqueTest(){
        int[] nums = new int[]{1,-1};
        int k = 1;

        assertEquals(CloseNums.containsCloseNums(nums,k),false);
    }

    @Test
    public void closeNums_negativeValueCloseTest(){
        int[] nums = new int[]{-1,-1};
        int k = 1;

        assertEquals(CloseNums.containsCloseNums(nums,k),true);
    }


}
