package ArrayExercisesTests;

import ArrayExercises.CryptarithmValidator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CryptarithmValidatorTest {

    @Test
    public void isCryptoSolution_validCryptarithmDifferentWordLengthTest(){
        String[] crypt= new String[] {"SEND","MORE","MONEY"};
        char[][] solution = new char[][]{
                {'O','0'},
                {'M','1'},
                {'Y','2'},
                {'E','5'},
                {'N','6'},
                {'D','7'},
                {'R','8'},
                {'S','9'}};
        assertIsCryptoSolution(crypt, solution, true);
    }

    @Test
    public void isCryptoSolution_invalidCryptarithmTest(){
        String[] crypt= new String[] {"TEN","TWO","ONE"};
        char[][] solution = new char[][]{
                {'O','1'},
                {'T','0'},
                {'W','9'},
                {'E','5'},
                {'N','4'}};
        assertIsCryptoSolution(crypt, solution, false);
    }

    @Test
    public void isCryptoSolution_validCryptarithmSameWordLengthTest(){
        String[] crypt= new String[] {"ONE","ONE","TWO"};
        char[][] solution = new char[][]{
                {'O','2'},
                {'T','4'},
                {'W','6'},
                {'E','1'},
                {'N','3'}};
        assertIsCryptoSolution(crypt, solution, true);
    }

    @Test
    public void isCryptoSolution_validCryptarithmOneWordLengthTest(){
        String[] crypt= new String[] {"A","A","A"};
        char[][] solution = new char[][]{
                {'A','0'}};
        assertIsCryptoSolution(crypt, solution, true);
    }

    @Test
    public void isCryptoSolution_invalidCryptarithmLengthOneDifferentValuesLengthTest(){
        String[] crypt= new String[] {"A","B","C"};
        char[][] solution = new char[][]{
                {'A','5'},
                {'B','6'},
                {'C','1'}};
        assertIsCryptoSolution(crypt, solution, false);
    }

    @Test
    public void isCryptoSolution_invalidCryptarithmLeadingZeroesTest(){
        String[] crypt= new String[] {"AA","AA","AA"};
        char[][] solution = new char[][]{
                {'A','0'}};
        assertIsCryptoSolution(crypt, solution, false);
    }

    @Test
    public void isCryptoSolution_invalidCryptarithmLengthOneSameValuesTest(){
        String[] crypt= new String[] {"A","A","A"};
        char[][] solution = new char[][]{
                {'A','1'}};
        assertIsCryptoSolution(crypt, solution, false);
    }

    private void assertIsCryptoSolution(String[] crypt, char[][] solution, boolean expectedResult) {
        boolean result = CryptarithmValidator.isCryptSolution(crypt, solution);
        assertEquals(result, expectedResult);
    }


}
