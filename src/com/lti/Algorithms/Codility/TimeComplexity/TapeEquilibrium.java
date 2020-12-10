package com.lti.Algorithms.Codility.TimeComplexity;

/**
 * Created by busis on 2020-12-10.
 */
public class TapeEquilibrium {
    public static void main(String[] args) {
        int[] a={3,1,2,4,3};
        System.out.println(new TapeEquilibrium().solution(a));
    }
    public int solution(int[] a){
        int sum=0;
        for(int i=0;i<a.length;i++)
            sum+=a[i];
        int leftSum=0;
        int ans=Integer.MAX_VALUE;
        int rightSum=0;
        for(int i=1;i<a.length;i++){
            leftSum+=a[i-1];
            rightSum=sum-leftSum;
            ans=Math.min(ans,(Math.abs(leftSum-rightSum)));
        }
        return ans;
    }
}
