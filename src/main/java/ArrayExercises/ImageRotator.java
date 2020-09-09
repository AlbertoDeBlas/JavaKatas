package ArrayExercises;

public class ImageRotator {
    public static int[][] rotateImage(int[][] a) {
        int i = 0;
        int j = 0;

        for(i= 0; i< a.length/2; i++){
            for(j = i; j < a.length - i-1; j++){
                //step 1
                int y = a[i][j];
                //step 2
                a[i][j] = a[a.length-j-1][i];
                //step 3
                a[a.length-j-1][i] = a[a.length-i-1][a.length-j-1];
                //step 4
                a[a.length-i-1][a.length-j-1] = a[j][a.length-i-1];
                //step 5
                a[j][a.length-i-1] = y;
            }
        }
        return a;
    }
}
