package com.lti.Algorithms.Codility.DynamicProgramming;

import java.util.Arrays;

/**
 * Created by busis on 2020-12-17.
 */
public class CoinChange {
    public static void main(String[] args) {
        int[] coins={1,2,3,4,5};
        int amount=11;
        System.out.println(solution(coins,amount));

    }
    static int solution(int[] coins,  int amount){
        int[] dp=new int[amount+1];
        Arrays.fill(dp,amount+1);//Illegitimate
        //0 coins for 0
        dp[0]=0;
        for(int i=1;i<=amount;i++){
            for(int j=0;j<coins.length;j++){
                if(coins[j]<=i)
                    dp[i]=Math.min(dp[i],1+dp[i-coins[j]]);
            }
        }
        if(dp[amount]>amount)
            return -1;
        return dp[amount];
    }
}
