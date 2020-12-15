package com.lti.Algorithms.Codility.EuclideanAlgorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by busis on 2020-12-14.
 */
public class ChocolateByNumbers {
    public static void main(String[] args) {
        System.out.println(solution(10,4));
    }
    public static int solution(int n, int m){
        if(m==1)
            return n;

        Set<Integer> set=new HashSet<Integer>();
        int num=0;
        int ans=0;
        while(!set.contains(num)){
            set.add(num);
            ans+=1;
            num=(num+m)%n;
        }
        return ans;
    }
}
