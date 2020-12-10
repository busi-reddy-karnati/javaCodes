package com.lti.Algorithms;

/**
 * Created by busis on 2020-12-10.
 */
public class SingleDigitSum {
    public static void main(String[] args) {
        System.out.println(digitSum(6745));
    }
    public static int digitSum(int n){
        int ans=0;
        while (n>0){
            ans+=n%10;
            n/=10;
        }
        while (ans>9){
            int s=0;
            while(ans>0){
                s+=ans%10;
                ans/=10;

            }
            ans=s;
        }
        return ans;
    }
}
