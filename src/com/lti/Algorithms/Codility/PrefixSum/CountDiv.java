package com.lti.Algorithms.Codility.PrefixSum;

/**
 * Created by busis on 2020-12-11.
 */
public class CountDiv {
    public static void main(String[] args) {
        System.out.println(new CountDiv().solution(11,345,17));
    }
    public int solution(int a,int b, int k){
        // when we do b-a, we get b but a isn't considered
        //For that add 1
        int ans=Math.floorDiv(b,k)-Math.floorDiv(a,k);
        if(a%k==0 )
            ans+=1;
        return ans;
    }
}
