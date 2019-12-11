package test.java.azubi.challenge.firstyear;

import org.junit.Test;
import static org.junit.Assert.*; 

import main.java.azubi.challenge.firstyear.UniqueCharsTester;

public class UniqueCharsTesterTest {

    @Test
    public void wordWithSingleLetter_should_beTrue() {
        boolean actual = UniqueCharsTester.hasUniqueChars("a");
        assertTrue(actual);
    }

    @Test
    public void WordWithDoubleChars_should_BeFalse() {
        boolean actual = UniqueCharsTester.hasUniqueChars("aa");
        assertFalse(actual);
    }

    @Test
    public void WordWithUniqueChars_should_BeTrue() {
        boolean actual = UniqueCharsTester.hasUniqueChars("abcd efg");
        assertTrue(actual);
    }


    @Test
    public void WordWithTwoSpaces_should_BeFalse() {
        boolean actual = UniqueCharsTester.hasUniqueChars("a bc d");
        assertfalse(actual);
    }
}