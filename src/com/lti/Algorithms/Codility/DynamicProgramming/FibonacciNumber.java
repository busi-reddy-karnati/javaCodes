package com.lti.Algorithms.Codility.DynamicProgramming;

/**
 * Created by busis on 2020-12-17.
 */
public class FibonacciNumber {
    static int[] fibNums=new int[2000];

    public static void main(String[] args) {
        int n=6;
        fibNums[0]=0;
        fibNums[1]=1;
        System.out.println(fibonacciNumber(n));
        System.out.println(fibonacciNumbersWithoutRecursion(n));
    }
    static int fibonacciNumber(int n){
        if(n<=1)
            return fibNums[n];
        if(fibNums[n]>0)
            return fibNums[n];
        int ans=0;
        ans=fibonacciNumber(n-1)+fibonacciNumber(n-2);
        fibNums[n]=ans;
        return ans;
    }
    static int fibonacciNumbersWithoutRecursion(int n){
        if(n<=1)
            return n;
        int[] a=new int[n+1];
        a[0]=0;
        a[1]=1;
        for(int i=2;i<n+1;i++)
            a[i]=a[i-1]+a[i-2];
        return a[n];
    }
}
