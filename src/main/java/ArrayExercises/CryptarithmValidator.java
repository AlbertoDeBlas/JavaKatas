package ArrayExercises;

import java.math.BigInteger;
import java.util.HashMap;

public class CryptarithmValidator {
    public static boolean isCryptSolution(String[] crypt, char[][] solution) {
        try{

            //HashSet<String, Integer> solutionSet = new HashSet<>(Arrays.asList(solution));

            HashMap<Character, Integer> solutionMap = new HashMap<Character, Integer>();

            for (int i=0; i<solution.length; i++){
                solutionMap.put(solution[i][0], Integer.valueOf(solution[i][1])-'0');
            }


            long word1 = transformWord(crypt[0],solutionMap);
            long word2 = transformWord(crypt[1],solutionMap);
            long word3 = transformWord(crypt[2],solutionMap);

            return isValidEquation(word1,word2,word3);
        }catch(LeadingZeroException e){
            return false;
        }
    }

    static boolean isValidEquation(long word1, long word2, long word3){
        if (word1 < 0 || word2 < 0 || word3 < 0) return false;

        if ((word1 + word2) == word3){
            return true;
        }else{
            return false;
        }
    }

    static long transformWord(String wordLetters, HashMap solution) throws LeadingZeroException{
        String wordNumbers = new String();

        if(wordLetters.length() > 1){
            leadingZero(wordLetters.charAt(0),solution);
        }

        for(int i = 0; i < wordLetters.length();i++){
            int value = findValue(wordLetters.charAt(i), solution);
            wordNumbers = wordNumbers + value;
        }
        return (new BigInteger(wordNumbers)).longValue();
    }

    static void leadingZero(char firstChar, HashMap solution) throws LeadingZeroException{
        if (findValue(firstChar,solution) == 0){
            throw new LeadingZeroException("Leading zero");
        }
    }

    static int findValue(char character, HashMap solution){
        return (Integer)solution.get(character);
    }

    public static class LeadingZeroException extends Exception {
        public LeadingZeroException(String errorMessage) {
            super(errorMessage);
        }
    }

}
