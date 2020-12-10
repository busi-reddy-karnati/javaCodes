package com.lti.Algorithms.Codility.Iterations;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryGapIterationsTest {

    @Test
    public void testSolution() throws Exception {
        int expectation=new BinaryGapIterations().solution(191);
        int reality=1;
        assertEquals(expectation,reality);
    }

    @Test
    public void testSolution2() throws Exception {
        int expectation=new BinaryGapIterations().solution(102354);
        int reality=3;
        assertEquals(expectation,reality);
    }
    @Test
    public void testSolution3() throws Exception {
        int expectation=new BinaryGapIterations().solution(1254658525);
        int reality=3;
        assertEquals(expectation,reality);
    }
    @Test
    public void testSolution4() throws Exception {
        int expectation=new BinaryGapIterations().solution(1024);
        int reality=0;
        assertEquals(expectation,reality);
    }

}