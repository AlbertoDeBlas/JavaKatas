package ListExercisesTests;

import ListExercises.ListNode;
import ListExercises.ListPalindromeDecider;
import ListExercisesTests.ListExerciseTest;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ListPalindromeDeciderTest extends ListExerciseTest {
    @Test
    public void isListPalindrome_isAPalindromeOddLengthTest(){
        int[] myArray = new int[] {0, 1, 0};

        ListNode<Integer> head = createList(myArray, 0);
        assert(ListPalindromeDecider.isListPalindrome(head));
    }

    @Test
    public void isListPalindrome_isNotAPalindromeOddLengthTest(){
        int[] myArray = new int[] {0, 1, 1};

        ListNode<Integer> head = createList(myArray, 0);
        assertFalse(ListPalindromeDecider.isListPalindrome(head));
    }

    @Test
    public void isListPalindrome_isNotAPalindromePairLengthTest(){
        int[] myArray = new int[] {1, 2, 2, 3};

        ListNode<Integer> head = createList(myArray, 0);
        assertFalse(ListPalindromeDecider.isListPalindrome(head));
    }

    @Test
    public void isListPalindrome_isAPalindromePairLengthTest(){
        int[] myArray = new int[] {1, 2, 2, 1};

        ListNode<Integer> head = createList(myArray, 0);
        assertTrue(ListPalindromeDecider.isListPalindrome(head));
    }

    @Test
    public void isListPalindrome_isAPalindromePairLengthWithNegativeElementsTest(){
        int[] myArray = new int[] {1, 1000000000, -1000000000, -1000000000, 1000000000, 1};

        ListNode<Integer> head = createList(myArray, 0);
        assertTrue(ListPalindromeDecider.isListPalindrome(head));
    }

    @Test
    public void isListPalindrome_emptyListTest(){
        int[] myArray = new int[] {};

        ListNode<Integer> head = createList(myArray, 0);
        assertTrue(ListPalindromeDecider.isListPalindrome(head));
    }

    @Test
    public void isListPalindrome_oneItemListTest(){
        int[] myArray = new int[] {1};

        ListNode<Integer> head = createList(myArray, 0);
        assertTrue(ListPalindromeDecider.isListPalindrome(head));
    }


}
