package com.lti.Algorithms.Codility.SieveOfEratosthenes;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by busis on 2020-12-14.
 */
public class CountNonDivisible {
    public static void main(String[] args) {
        int[] a={3,1,2,3,6};
        System.out.println(Arrays.toString(solution(a)));
    }
    public static int[] solution(int[] a){
        int n=a.length;
        int[] ans=new int[n];
        //HashMap replaces the old with new one in case of collisions
        Map<Integer,Integer> frequencyMap=new TreeMap<Integer, Integer>();
        int maxValue=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]>maxValue)
                maxValue=a[i];
            int v=frequencyMap.containsKey(a[i])?frequencyMap.get(a[i]):0;
            v+=1;
            frequencyMap.put(a[i],v);
        }
        for(int i=0;i<n;i++){
            int num=a[i];
            int freq=0;
            int sqrtNum=(int)Math.sqrt(num);
            for(int j=1;j<=sqrtNum;j++){
                if(num%j==0){
                    freq+=frequencyMap.containsKey(j)?frequencyMap.get(j):0;
                    freq+=frequencyMap.containsKey(num/j)?frequencyMap.get(num/j):0;
                }
            }
            if(sqrtNum*sqrtNum==num)
                freq-=frequencyMap.containsKey(sqrtNum)?frequencyMap.get(sqrtNum):0;
            ans[i]=n-freq;
        }
        return ans;

    }
}
