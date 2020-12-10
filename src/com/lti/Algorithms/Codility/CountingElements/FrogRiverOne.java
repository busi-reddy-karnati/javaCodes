package com.lti.Algorithms.Codility.CountingElements;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by busis on 2020-12-10.
 */
public class FrogRiverOne {
    public static void main(String[] args) {
        int[] input={1,3,1,4,2,3,5,4};
        int x=5;
        System.out.println(new FrogRiverOne().solution(x,input));
    }
    public int solution(int x, int[] a){
        int n=a.length;
        Set<Integer> set=new HashSet<Integer>();
        for(int i=0;i<n;i++){
            set.add(a[i]);
            if(set.size()==x)
                return i;
        }
        return -1;
    }
}
