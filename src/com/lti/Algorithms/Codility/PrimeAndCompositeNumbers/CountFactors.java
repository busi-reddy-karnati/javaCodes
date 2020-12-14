package com.lti.Algorithms.Codility.PrimeAndCompositeNumbers;

/**
 * Created by busis on 2020-12-14.
 */
public class CountFactors {
    public static void main(String[] args) {
        System.out.println(solution(39916800));
    }
    public static int solution(int n){
        int ans=0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0)
                ans+=2;
        }
        if((int)Math.sqrt(n)*(int)Math.sqrt(n)==n)
            ans-=1;
        return ans;
    }
}
