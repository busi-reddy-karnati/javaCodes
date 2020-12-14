package com.lti.Algorithms.Codility.PrimeAndCompositeNumbers;

/**
 * Created by busis on 2020-12-14.
 */
public class MinimumPerimeter {
    public static void main(String[] args) {
        System.out.println(solution(30));
    }
    public static int solution(int n){
        int factor=maxFactor(n);
        int secondFactor=n/factor;
        return 2*(factor+secondFactor);
    }
    public static int maxFactor(int n){
        for(int i=(int)Math.sqrt(n);i>0;i--){
            if(n%i==0)
                return i;
        }
        return 1;
    }
}
