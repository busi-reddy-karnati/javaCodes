package com.lti.Algorithms.Codility.MaximumSliceProblem;
/*
This is using
 */
public class MaximumDoubleSlice {
    public static void main(String[] args) {
        int[] a={3,2,6,-1,4,5,-1,2};
        System.out.println(solution(a));
    }
    static int solution(int[] a){
        int ans=0;
        int n=a.length;
        int[] sumTill=new int[n];
        int[] sumFrom=new int[n];
        for(int i=1;i<n;i++){
            //If the sum is being carried from elsewhere, don't break the chain
            //If this is starting, make it 0 coz we don't consider the element
            sumTill[i]=Math.max(sumTill[i-1]+a[i],0);
        }
        for(int i=n-2;i>=0;i--){
            sumFrom[i]=Math.max(0,sumFrom[i+1]+a[i]);
        }
        for(int i=1;i<n-1;i++){
            ans=Math.max(ans,sumFrom[i+1]+sumTill[i-1]);
        }
        return ans;
    }
}
