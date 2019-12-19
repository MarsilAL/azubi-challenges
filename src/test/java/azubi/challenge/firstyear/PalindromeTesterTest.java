package test.java.azubi.challenge.firstyear;

import org.junit.Test;
import static org.junit.Assert.*; 

import main.java.azubi.challenge.firstyear.PalindromeTester;;

/*
./gradlew test --tests *.PalindromeTesterTest
*/
public class PalindromeTesterTest {
    
    @Test
    public void isPalindrome_shouldReturn_true_for_single_digit(){
        int input = 0;
        boolean actual = PalindromeTester.isPalindrome(input);
        assertTrue(actual);
    }

    @Test
    public void isPalindrome_shouldReturn_true_for_same_digits(){
        int input = 1111111;
        boolean actual = PalindromeTester.isPalindrome(input);
        assertTrue(actual);
    }


    @Test
    public void isPalindrome_shouldReturn_false_when_first_digit_not_equal_second(){
        int input = 12;
        boolean actual = PalindromeTester.isPalindrome(input);
        assertFalse(actual);
    }
}