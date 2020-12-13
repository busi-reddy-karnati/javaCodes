package com.lti.Algorithms.Codility.Leader;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by busis on 2020-12-13.
 */
class Solution2{
    static int leader=0;
    public boolean findLeader(int[] a){
        Map<Integer,Integer> map=new HashMap<Integer, Integer>();
        int n=a.length;
        if(n==1){
            leader=a[0];
            return true;
        }
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
                    leader=a[i];
                    return true;
                }
            }
            else{
                map.put(a[i],1);
            }
        }
        return false;
    }
    public int solution(int[] a){
        int n=a.length;
        int ans=0;
        if(!findLeader(a))
            return 0;
        int numberOfLeaders=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==leader)
                numberOfLeaders++;
        }
        int leadersOnLeft=0;
        int leadersOnRight=numberOfLeaders;
        for(int i=0;i<a.length-1;i++){
            if(a[i]==leader){
                leadersOnLeft+=1;
                leadersOnRight-=1;
            }
            if(leadersOnLeft>(0.5)*(i+1)&&leadersOnRight>(0.5)*(n-i-1))
                ans+=1;
        }
        return ans;
    }
}
public class EquiLeader {
    public static void main(String[] args) {
        int[] a={4,3,4,4,4,2};
        System.out.println(new Solution2().solution(a));
    }
}
