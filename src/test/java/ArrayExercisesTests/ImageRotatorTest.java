package ArrayExercisesTests;

import ArrayExercises.ImageRotator;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ImageRotatorTest {

    @Test
    public void rotateImage_3x3matrix(){
        int[][] a =  new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][] expectedResult =  new int[][]{{7,4,1},{8,5,2},{9,6,3}};

        assertRotateImage(a, expectedResult);
    }

    @Test
    public void rotateImage_1Dmatrix(){
        int[][] a =  new int[][]{{1}};
        int[][] expectedResult =  new int[][]{{1}};

        assertRotateImage(a, expectedResult);
    }

    @Test
    public void rotateImage_2x2matrix(){
        int[][] a =  new int[][]{{1,2},{3,4}};
        int[][] expectedResult =  new int[][]{{3,1},{4,2}};

        assertRotateImage(a, expectedResult);
    }

    @Test
    public void rotateImage_5x5matrix(){
        int[][] a =  new int[][]{{10,9,6,3,7},{6,10,2,9,7},{7,6,3,8,2},{8,9,7,9,9},{6,8,6,8,2}};
        int[][] expectedResult =  new int[][]{{6,8,7,6,10},{8,9,6,10,9},{6,7,3,2,6},{8,9,8,9,3},{2,9,2,7,7}};

        assertRotateImage(a, expectedResult);
    }

    private void assertRotateImage(int[][] a, int[][] expectedResult) {
        int[][] result = ImageRotator.rotateImage(a);
        assertArrayEquals(result, expectedResult);
    }
}
