package com.lti.JUnitDemo;

import org.junit.Test;

import static org.junit.Assert.*;


/*
how to get Test is import the Junit and hover over that to create a test

 */
public class CodingTest {
    /*
    Place on  the class and press ALT+ENTER
    This is for IntelliJ IDEA
    */

    @Test//Telling that this is a test function
    public void testMakeUpper() throws Exception {
        String res=new Coding().makeUpper("Apple");
        //This is the input to Coding.makeUpper

        //Here we write a test case
        assertEquals("Apple",res);

        //We can add more than one test case
        //But the standard is not that
        //write in every method
        res=new Coding().makeUpper("apple");
        assertEquals("apple",res);
    }

}