package com.lti.Algorithms.Codility.Sorting;

import java.util.Arrays;

/**
 * Created by busis on 2020-12-13.
 */
public class UniqueThreeSum {
    public static void main(String[] args) {
        int[] a={-3,1,2,-2,5,6};
        System.out.println(new UniqueThreeSum().solution(a));
    }
    public int solution(int[] a){
        Arrays.sort(a);
        int n=a.length;
        return Math.max(Math.max(a[n-1]*a[n-2]*a[n-3],a[0]*a[1]*a[2]),Math.max(a[n-1]*a[n-2]*a[0],a[0]*a[1]*a[n-1]));
    }
}
