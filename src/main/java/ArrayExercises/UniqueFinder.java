package ArrayExercises;

import java.util.ArrayList;

public class UniqueFinder {
    public static char firstNotRepeatingCharacter(String s) {

        int baseline_ascii = (int) 'a';
        int bottom_ascii = (int) 'z';

        int[] counts = new int[bottom_ascii - baseline_ascii+1];
        ArrayList<Integer> appearanceOrder = new ArrayList();

        for(int i = 0; i < s.length();i++){
            counts[(int)s.charAt(i)-baseline_ascii]++;

            if (!appearanceOrder.contains(s.charAt(i)-baseline_ascii)){
                appearanceOrder.add(s.charAt(i)-baseline_ascii);
            }
        }

        for (Integer item : appearanceOrder) {
            if (counts[item]== 1) {
                return (char)(item+baseline_ascii);
            }
        }

        return '_';
    }
}
