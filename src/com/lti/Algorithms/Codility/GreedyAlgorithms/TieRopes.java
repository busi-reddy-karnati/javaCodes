package com.lti.Algorithms.Codility.GreedyAlgorithms;

/**
 * Created by busis on 2020-12-16.
 */
public class TieRopes {
    public static void main(String[] args) {
        int a[]={1,2,3,4,1,1,3};
        System.out.println(solution(4,a));
    }
    public static int solution(int k, int[] a) {
        int ans=0;
        int presentLength=0;
        int n=a.length;
        for(int i=0;i<n;i++){
            presentLength+=a[i];
            if(presentLength>=k){
                ans+=1;
                presentLength=0;
            }
        }
        return ans;
    }
}
