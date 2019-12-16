package main.java.azubi.challenge.firstyear;

public class PermutationTester {

    /**
     * isPermutationOfOther return true, when first is a permutation of second, 
     * false otherwise.
     * 
     * A permutation is an reordering of the characters.
     * 
     * @param first String
     * @param second String
     */
    public static boolean isPermutationOfOther(String first, String second) {
        // implement me

        if (first.isEmpty() && second.isEmpty()){
            return true;
        }

        int x = first.length();
        int y = second.length();

        for (int i = 0; i < x; i++){
            if (i > 0){y = y--;}

            if(first.charAt(i) == second.charAt(y-1)){

                return true;
            }
        
        }
        return false;
    }
}