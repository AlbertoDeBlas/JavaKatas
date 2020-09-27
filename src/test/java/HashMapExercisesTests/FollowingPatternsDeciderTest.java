package HashMapExercisesTests;

import HashMapExercises.FollowingPatternsDecider;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FollowingPatternsDeciderTest {
    @Test
    public void areFollowingPatterns_twoRepeatedValuesFalseTest(){
        String [] strings = new String[]{"cat","dog","dog","cat"};
        String [] pattern = new String[]{"a","b","b","b"};

        assertAreFollwingPatterns(strings, pattern, false);
    }

    @Test
    public void areFollowingPatterns_oneRepeatedValueTrueTest(){
        String [] strings = new String[]{"cat","dog","dog"};
        String [] pattern = new String[]{"a","b","b"};

        assertAreFollwingPatterns(strings, pattern, true);
    }

    @Test
    public void areFollowingPatterns_withoutRepeatedValuesFalseTest(){
        String [] strings = new String[]{"cat","dog","dough"};
        String [] pattern = new String[]{"a","b","b"};

        assertAreFollwingPatterns(strings, pattern, false);
    }

    @Test
    public void areFollowingPatterns_oneValueListTest(){
        String [] strings = new String[]{"cat"};
        String [] pattern = new String[]{"a"};

        assertAreFollwingPatterns(strings, pattern, true);
    }

    private void assertAreFollwingPatterns(String[] strings, String[] pattern, boolean b) {
        Boolean result = b;
        assertEquals(result, FollowingPatternsDecider.areFollowingPatterns(strings, pattern));
    }
}
