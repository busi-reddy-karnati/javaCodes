package com.lti.Algorithms;

/**
 * Created by busis on 2020-12-11.
 */
public class MinimumCurrencyNotes {
    public static void main(String[] args) {
        System.out.println(getNoteCount(1010));
    }
    static int getNoteCount(int n){
        int ans=0;
        ans+=(n/500);
        n=n%500;
        ans+=n/200;
        n=n%200;
        ans+=n/100;
        n=n%100;
        ans+=n/50;
        n=n%50;
        ans+=n/20;
        n=n%20;
        ans+=n/10;
        return ans;
    }
}
