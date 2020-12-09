package com.lti.Algorithms;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArraysTest {

    @Test
    public void testSwapSort() throws Exception {
        int[] input;
        int[] output;
        input= new int[]{12, 34, 35, 16, 19, 27};
        output= new int[]{21, 43, 53, 61, 72, 91};
        Arrays arrays=new Arrays();
        input=arrays.swapSort(input);
        assertArrayEquals(input,output);
    }
    @Test
    public void testSortByAge() throws Exception{
        String[] input={"iam-22","bro-21","bro2-19","bro4-10"};
        Arrays arrays=new Arrays();
        String[] output=arrays.sortByAge(input);
        String[] expected={"bro4-10","bro2-19","bro-21","iam-22"};
        assertArrayEquals(expected,output);
    }
    @Test
    public void testSwapSort1() throws Exception{
        int[] input;
        int[] output;
        input= new int[]{121, 34, 235, 316, 19, 27};
        output= new int[]{43,72,91,121,532,613};
        Arrays arrays=new Arrays();
        input=arrays.swapSort(input);
        assertArrayEquals(input,output);
    }
    @Test
    public void testMoveVowels() throws Exception{
        String input="AlPHa";
        Arrays arrays=new Arrays();
        char[] output = arrays.moveVowels(input);
        char[] expected={'A','a','l','P','H'};
        assertArrayEquals(expected,output);
    }

    @Test
    public void testMoveVowels1() throws Exception{
        String input="ShimlA";
        Arrays arrays=new Arrays();
        char[] output = arrays.moveVowels(input);
        char[] expected={'i','A','S','h','m','l'};
        assertArrayEquals(expected,output);
    }
    @Test
    public void testMoveVowels2() throws Exception{
        String input="Andha Dhun";
        Arrays arrays=new Arrays();
        char[] output = arrays.moveVowels(input);
        char[] expected={'A','a','u','n','d','h',' ','D','h','n'};
        assertArrayEquals(expected,output);
    }
}