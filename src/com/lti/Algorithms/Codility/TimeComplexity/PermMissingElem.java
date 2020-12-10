package com.lti.Algorithms.Codility.TimeComplexity;

/**
 * Created by busis on 2020-12-10.
 */
public class PermMissingElem {
    public static void main(String[] args) {
        int[] a={2,3,1,5};
        System.out.println(new PermMissingElem().solution(a));
    }
    public int solution(int[] a){
        int n=a.length;
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=a[i];
        if(n%2==0)
            return ((n+1)*((n+2)/2))-sum;
        return (((n+1)/2)*((n+2)))-sum;
    }
}

