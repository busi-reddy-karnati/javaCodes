package com.lti.Algorithms;

/**
 * Created by busis on 2020-12-11.
 */
public class MinimumCurrencyNotes {
    public static void main(String[] args) {
        System.out.println(getNoteCount(1010));
    }
    static int getNoteCount(int n){
        int a[]={500,200,100,50,20,10};
        int ans=0;
        for(int i:a){
            ans+=n/i;
            n%=i;
        }
        return ans;
    }
}
