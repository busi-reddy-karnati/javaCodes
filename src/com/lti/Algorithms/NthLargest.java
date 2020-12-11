package com.lti.Algorithms;

import java.util.*;
/**
 * Created by busis on 2020-12-11.
 */
public class NthLargest {
    public static void main(String[] args) {
        //handle all the duplicates too
        int a[]={1,1,1,1,1,2,3};
        System.out.println(solution(a,3));
    }

    public static int solution(int[] a,int n){
        Set<Integer> set=new TreeSet<Integer>();
        for(int i:a)
            set.add(i);
        if(set.size()<n)
            return -1;
        List<Integer> list=new ArrayList<Integer>();
        for(int i:set)
            list.add(i);
        Collections.reverse(list);
        return list.get(n-1);
    }

}
