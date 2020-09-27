package HashMapExercises;

import java.util.HashMap;

public class CloseNums {

    public static boolean containsCloseNums(int[] nums, int k) {

        HashMap<Integer,Integer> numPositions = new HashMap();

        for(int i = 0; i < nums.length;i++){
            if(numPositions.containsKey(nums[i])){
                int distance = i-Integer.valueOf(numPositions.get(nums[i]));
                if(distance <= k){
                    return true;
                }else{
                    numPositions.put(nums[i],i);
                }
            }else{
                numPositions.put(nums[i],i);
            }
        }
        return false;
    }
}
