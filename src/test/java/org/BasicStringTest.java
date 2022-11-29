package org;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicStringTest {
    @Test
    public void convertStringToIntegerTest() {
        Assertions.assertEquals( 13, BasicString.stringToInteger("13"));
        Assertions.assertEquals(294023940, BasicString.stringToInteger("294023940"));
        Assertions.assertEquals(-12414141, BasicString.stringToInteger("-12414141"));
        Assertions.assertEquals(-1, BasicString.stringToInteger("not a number"));
    }

    @Test
    public void reverseStringTest() {
        Assertions.assertEquals("cba", BasicString.reverseString("abc"));
        Assertions.assertEquals("a", BasicString.reverseString("a"));
        Assertions.assertEquals("abcd", BasicString.reverseString("dcba"));
        Assertions.assertEquals("", BasicString.reverseString(""));
    }

    @Test
    public void areCharsUniqueTest() {
        Assertions.assertEquals(true, BasicString.areCharsUnique("abcdefghijk"));
        Assertions.assertEquals(false, BasicString.areCharsUnique("abcdefgaijk"));
    }

    @Test
    public void isInputAnagramOfOrgTest() {
        Assertions.assertEquals(true, BasicString.isInputAnagramOfOrg("abcde", "aecbd"));
        Assertions.assertEquals(false, BasicString.isInputAnagramOfOrg("abcde", "aecbf"));
        Assertions.assertEquals(false, BasicString.isInputAnagramOfOrg("abcde", "aecf"));
    }

    @Test
    public void getCountOfInputInTargetTest() {
        Assertions.assertEquals(2, BasicString.getCountOfInputInTarget("I am a good boy and a programmer", "a"));
        Assertions.assertEquals(0, BasicString.getCountOfInputInTarget("I am a good boy and a programmer", "apple"));
    }



}