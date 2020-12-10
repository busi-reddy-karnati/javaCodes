package com.lti.Algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingleDigitSumTest {

    @Test
    public void testDigitSum() throws Exception {
        int num=6745;
        int expectation=4;
        int reality=new SingleDigitSum().digitSum(num);
        assertEquals(expectation,reality);
    }
    @Test
    public void testDigitSum1() throws Exception {
        int num=569;
        int expectation=2;
        int reality=new SingleDigitSum().digitSum(num);
        assertEquals(expectation,reality);
    }
    @Test
    public void testDigitSum2() throws Exception {
        int num=123;
        int expectation=6;
        int reality=new SingleDigitSum().digitSum(num);
        assertEquals(expectation,reality);
    }
}