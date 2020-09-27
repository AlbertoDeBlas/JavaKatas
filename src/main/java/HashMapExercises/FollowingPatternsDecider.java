package HashMapExercises;

import java.util.Hashtable;

public class FollowingPatternsDecider {
    public static boolean areFollowingPatterns(String[] strings, String[] patterns) {
        Hashtable<String, String> savedInfo = new Hashtable<>();
        if(strings.length != patterns.length){
            return false;
        }
        for(int i = 0; i < strings.length; i++){
            if(savedInfo.containsKey(patterns[i])){
                if(!savedInfo.get(patterns[i]).equals(strings[i])){
                    return false;
                }
            }
            else{
                if(savedInfo.containsValue(strings[i])){
                    return false;
                }
                savedInfo.put(patterns[i], strings[i]);
            }
        }
        return true;
    }
}
