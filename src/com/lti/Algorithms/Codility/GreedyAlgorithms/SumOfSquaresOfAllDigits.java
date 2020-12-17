package com.lti.Algorithms.Codility.GreedyAlgorithms;

/**
 * Created by busis on 2020-12-17.
 */
public class SumOfSquaresOfAllDigits {
    public static void main(String[] args) {
        System.out.println(solution(20));
    }
    public static boolean solution(int n){
        int ans=0;
        int buffer=n;
        while(buffer>0){
            int digit=buffer%10;
            ans+=digit*digit;
            buffer=buffer/10;
        }
        if(ans==4)
            return false;
        if(ans==1)
            return true;
        return solution(ans);
    }
}
