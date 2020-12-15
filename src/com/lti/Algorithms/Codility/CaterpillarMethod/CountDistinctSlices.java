package com.lti.Algorithms.Codility.CaterpillarMethod;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by busis on 2020-12-15.
 */
public class CountDistinctSlices {
    public static void main(String[] args) {
        int[] a={3,4,5,5,2};
        System.out.println(solution(a));
    }
    public static int solution(int[] a){
        int ans=0;
        int n=a.length;
        Set<Integer> set=new HashSet<Integer>();
        for(int i=0;i<n;i++){
            if(set.contains(a[i])){
                int len=set.size();
                if(len%2==0)
                    ans+=(len/2)*(len+1);
                else
                    ans+=(len)*((len+1)/2);
                set.clear();
                set.add(a[i]);
            }
            else
                set.add(a[i]);
        }
        int len=set.size();
        if(len%2==0)
            ans+=(len/2)*(len+1);
        else
            ans+=(len)*((len+1)/2);

        return ans;
    }
}
