package com.buddybuild.bbandroidsampletests;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class StringUnitTest {
    @Test
    public void length_isCorrect() throws Exception {
        assertEquals(4, "test".length());
    }

    @Test
    public void substring_isCorrect() throws Exception {
        assertEquals("ha", "sha".substring(1));
    }

    @Test
    public void indexOf_isCorrect() throws Exception {
        assertEquals(3, "hello".indexOf("lo"));
    }
}