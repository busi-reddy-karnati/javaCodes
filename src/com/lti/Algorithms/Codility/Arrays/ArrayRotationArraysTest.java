package com.lti.Algorithms.Codility.Arrays;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayRotationArraysTest {

    @Test
    public void testSolution() throws Exception {
        int[] input={1,2,3,4,5};
        int[] expected={4,5,1,2,3};
        int k=2;
        int[] reality=new ArrayRotationArrays().solution(input,k);
        assertArrayEquals(expected, reality);
    }

    @Test
    public void testSolution2() throws Exception {
        int[] input={6,2,4,5,3,45,8};
        int[] expected={5,3,45,8,6,2,4};
        int k=4;
        int[] reality=new ArrayRotationArrays().solution(input,k);
        assertArrayEquals(expected, reality);
    }


}