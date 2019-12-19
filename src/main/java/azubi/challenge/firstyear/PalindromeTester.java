package main.java.azubi.challenge.firstyear;

public class PalindromeTester {
    /**
     * Returns true if given input is palindrome, false otherwise
     * 
     * input: int
     * output: boolean
     */
    public static boolean  isPalindrome(int input){

        // 1. convert int to string
        String convertedInput = Integer.toString(input);

        // 2. reverse the new string
        String reverseInput = reverseString(convertedInput);

        // 3. compare reversed with converted string
        if(convertedInput.equals(reverseInput)){  /////// nochmal
            return true;
        } else{
            return false;
        }
    }

    /**
     * Reverses the given input string
     * @param input String
     * @return reversed String
     */
    private static String reverseString(String input) {
        StringBuilder builder = new StringBuilder(input);
        return builder.reverse().toString();
    }
}