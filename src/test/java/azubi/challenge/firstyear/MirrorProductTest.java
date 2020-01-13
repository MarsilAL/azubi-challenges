package test.java.azubi.challenge.firstyear;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*; 

import main.java.azubi.challenge.firstyear.MirrorProduct;;

public class MirrorProductTest {

    @Test
    public void isThis2DPalindromeProductOrNot(){

        int actual = MirrorProduct.findLargestMirrorProduct(91, 99);
        
        int expected = 9009;

        assertEquals(expected, actual);

    }
    @Test 
    public void isThis4DPalindromeProductOrNot(){
        int actual = MirrorProduct.findLargestMirrorProduct(9999, 9999);

        int expected = 1997997991;
        System.out.println(actual);
        assertEquals(expected, actual);
    }
    @Test 
    public void isThis3DPalindromeProductOrNot(){
        int actual = MirrorProduct.findLargestMirrorProduct(999, 999);

        int expected = 698896;

        assertEquals(expected, actual);
    }
}
