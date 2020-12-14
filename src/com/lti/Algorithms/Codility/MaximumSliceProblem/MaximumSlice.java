package com.lti.Algorithms.Codility.MaximumSliceProblem;
/*

This is the implementation of Kadane's Algorithm.
For an element, the maximum sum can be either the element itself or the element combined with the previous sum
 We take maximum of all those maxs
 */
public class MaximumSlice {
    public static void main(String[] args) {
        int[] a={3,2,-6,4,0};
        System.out.println(solution(a));
    }
    public static int solution(int[] a){
        int ans=a[0];
        int sum=a[0];
        for(int i=1;i<a.length;i++){
            int sum2=sum+a[i];
            sum=Math.max(a[i],sum2);
            ans=Math.max(sum,ans);
        }
        return ans;
    }
}
