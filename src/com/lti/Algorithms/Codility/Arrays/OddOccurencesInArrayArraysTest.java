package com.lti.Algorithms.Codility.Arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OddOccurencesInArrayArraysTest {

    @Test
    public void testSolution() throws Exception {
        int input[]={1,1,2,2,3,2,1,2,1,9,8,7,8,3,9};
        int expectation=7;
        int reality=new OddOccurencesInArrayArrays().solution(input);
        assertEquals(expectation,reality);
    }
    @Test
    public void testSolution1() throws Exception {
        int input[]={1};
        int expectation=1;
        int reality=new OddOccurencesInArrayArrays().solution(input);
        assertEquals(expectation,reality);
    }
    @Test
    public void testSolution2() throws Exception {
        int input[]={1010101,1010101,121212,121212,121212,121212,1252};
        int expectation=1252;
        int reality=new OddOccurencesInArrayArrays().solution(input);
        assertEquals(expectation,reality);
    }
    @Test
    public void testSolution3() throws Exception {
        int input[]={12,13,14,12,13,14,12};
        int expectation=12;
        int reality=new OddOccurencesInArrayArrays().solution(input);
        assertEquals(expectation,reality);
    }
    @Test
    public void testSolution4() throws Exception {
        int input[]={1,1,2,2,3,1,5,3,1};
        int expectation=5;
        int reality=new OddOccurencesInArrayArrays().solution(input);
        assertEquals(expectation,reality);
    }
}