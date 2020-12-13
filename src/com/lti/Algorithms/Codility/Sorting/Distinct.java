package com.lti.Algorithms.Codility.Sorting;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by busis on 2020-12-13.
 */
public class Distinct {
    public static void main(String[] args) {
        int[] a={1,2,3,1,2,3,1,2,3};
        System.out.println(new Distinct().solution(a));
    }
    public int solution(int[] A) {
        Set<Integer> set=new HashSet<Integer>();
        for(int i:A){
            set.add(i);
        }
        return set.size();
    }
}
