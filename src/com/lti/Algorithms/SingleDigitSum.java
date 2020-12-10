package com.lti.Algorithms;

/**
 * Created by busis on 2020-12-10.
 */
public class SingleDigitSum {
    public static void main(String[] args) {
        //Single digit sum
        System.out.println(dS(6745));
    }
    //Another way
    public static int dS(int n){
        int b=0;
        int a=n;
        int i;
        while (a!=0){
            i=a%10;
            b+=i;
            a/=10;

        }
        if(b>9)
            b=dS(b);
        return b;
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
