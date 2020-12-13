package com.lti.Algorithms.Codility.Leader;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by busis on 2020-12-13.
 */
class Solution{
    public int solution(int[] a){
        Map<Integer,Integer> map=new HashMap<Integer, Integer>();
        int n=a.length;
        if(n==1)
            return 0;
        int freq=0;
        if(n%2==0)
            freq=(n/2)+1;
        else
            freq=(n+1)/2;
        for(int i=0;i<a.length;i++){
            if(map.containsKey(a[i])){
                int v=map.get(a[i]);
                map.replace(a[i],v+1);
                if(v+1==freq){
                    return i;
                }
            }
            else{
                map.put(a[i],1);
            }
        }
        return -1;
    }
}
public class Dominator {
    public static void main(String[] args) {
        int[] a={3,4,3,2,3,-1,3,3};
        System.out.println(new Solution().solution(a));
    }
}
