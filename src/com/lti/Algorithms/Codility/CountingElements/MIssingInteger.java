package com.lti.Algorithms.Codility.CountingElements;

/**
 * Created by busis on 2020-12-11.
 */
public class MissingInteger {
    public static void main(String[] args) {
        int[] a={1,3,6,4,1,2};
        System.out.println(new MissingInteger().solution(a));
    }
    public int solution(int[] a){
        int n=a.length;
        if(n==0)//Corner case
            return 1;
        boolean[] isPresent=new boolean[n+1];
        for(int i:a){
            if(i>0&&i<=n)
                isPresent[i]=true;
        }
        for(int i=1;i<n+1;i++)
            if(!isPresent[i])
                return i;
        return n+1;//If all the elements 1..n are there then we return n+1
    }
}
