package com.lti.Algorithms.Codility.CountingElements;

import java.util.Arrays;

/**
 * Created by busis on 2020-12-10.
 */
public class PermCheck {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        System.out.println(new PermCheck().solution(a));
    }
    public int solution(int[] a){
        //Arrays is a class for all the methods involving arrays
        //We can do in O(n) time by using extra space. A set for example
        //Keep a perfect sum
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            if(a[i]!=(i+1))
                return 0;
        }
        return 1;
    }
    //This approach doesn't work.
    //Example: 1,3,3,3
    public int solution1(int[] a){
        int n=a.length;
        int sum=0;
        if(n%2==1)
            sum=(n)*((n+1)/2);
        else
            sum=(n/2)*(n+1);
        int real=0;
        for(int i=0;i<n;i++){
            real+=a[i];
        }
        if(real==sum)
            return 1;
        return 0;
    }
}
