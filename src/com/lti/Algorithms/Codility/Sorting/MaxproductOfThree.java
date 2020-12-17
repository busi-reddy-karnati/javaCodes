package com.lti.Algorithms.Codility.Sorting;

import java.util.Arrays;
/*
sort the array
There can be three cases
all positives, all negatives, a mix
in all negatives, it would be the last three
in all positive it would be last three
in a mix, it would be either last three or first two(to make positive) and last one
 */
public class MaxProductOfThree {
    public static void main(String[] args) {
        int[] a={-3,1,2,-2,5,6};
        System.out.println(new MaxProductOfThree().solution(a));
    }
    public int solution(int[] a){
        Arrays.sort(a);
        int n=a.length-1;
        return Math.max(a[n]*a[n-1]*a[n-2],a[0]*a[1]*a[n]);
    }

}
