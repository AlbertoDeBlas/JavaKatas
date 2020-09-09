package ArrayExercisesTests;

import ArrayExercises.UniqueFinder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniqueFinderTest {

    @Test
    public void uniqueFinder_uniqueInTheMiddle(){
        String s = "abacabad";
        char expectedResult = 'c';
        assertFirstNotRepeatingCharacter(s, expectedResult);
    }

    @Test
    public void uniqueFinder_notUniqueValues(){
        String s = "abacabaabacaba";
        char expectedResult = '_';
        assertFirstNotRepeatingCharacter(s, expectedResult);
    }

    @Test
    public void uniqueFinder_uniqueValueOneElement(){
        String s = "z";
        char expectedResult = 'z';
        assertFirstNotRepeatingCharacter(s, expectedResult);
    }

    @Test
    public void uniqueFinder_NotUniqueValuesSameValueEdges(){
        String s = "bcccccccb";
        char expectedResult = '_';
        assertFirstNotRepeatingCharacter(s, expectedResult);
    }

    @Test
    public void uniqueFinder_onlyLastValueUnique(){
        String s = "bcccccccby";
        char expectedResult = 'y';
        assertFirstNotRepeatingCharacter(s, expectedResult);
    }

    @Test
    public void uniqueFinder_onlyFirstValueUnique(){
        String s = "ybcccccccb";
        char expectedResult = 'y';
        assertFirstNotRepeatingCharacter(s, expectedResult);
    }

    private void assertFirstNotRepeatingCharacter(String s, char expectedResult) {
        char result = UniqueFinder.firstNotRepeatingCharacter(s);
        assertEquals(result, expectedResult);
    }
}
