package ArrayExercises;

public class DuplicateFinder {
    public static int firstDuplicate(int[] a) {

        boolean[] counts = new boolean[a.length+1];

        if (a.length < 0) return -1;

        for(int i = 0;i<a.length;i++){
            if(counts[a[i]]){
                return a[i];
            }else{
                counts[a[i]] = true;
            }
        }
        return -1;
    }
}
