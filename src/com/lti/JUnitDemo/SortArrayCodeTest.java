package com.lti.JUnitDemo;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
public class SortArrayCodeTest {

    @Test
    public void testSortArray() throws Exception {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(4);
        ArrayList<Integer> s = new ArrayList<Integer>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        arrayList = new SortArrayCode().sortArray(arrayList);
        assertEquals(arrayList,s);

    }
}