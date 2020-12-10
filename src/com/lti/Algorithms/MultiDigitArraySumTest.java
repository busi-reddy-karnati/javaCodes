package com.lti.Algorithms;

import org.junit.Test;

import static com.lti.Algorithms.MultiDigitArraySum.*;
import static org.junit.Assert.assertEquals;

public class MultiDigitArraySumTest {

    @Test
    public void testGiveMaxMinSumV1() throws Exception {
        int[] input={12,34,56,99,45,11,77};
        int expectations=10;
        int reality=giveMaxMinSumV1(input);
        assertEquals(reality, expectations);
    }

    @Test
    public void testGiveMaxMinSumV2() throws Exception {
        int[] input={12,34,56,99,45,11,77};
        int expectations=21;
        int reality=giveMaxMinSumV2(input);
        assertEquals(reality, expectations);
    }

    @Test
    public void testGiveMaxMinSumV11() throws Exception {
        int[] input={12,34,56,91,45,11,77};
        int expectations=10;
        int reality=giveMaxMinSumV1(input);
        assertEquals(reality, expectations);
    }

    @Test
    public void testGiveMaxMinSumV22() throws Exception {
        int[] input={12,34,56,91,45,11,77};
        int expectations=13;
        int reality=giveMaxMinSumV2(input);
        assertEquals(reality, expectations);
    }
}