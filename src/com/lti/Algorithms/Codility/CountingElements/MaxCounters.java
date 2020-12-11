package com.lti.Algorithms.Codility.CountingElements;

import java.util.Arrays;

/**
 * Created by busis on 2020-12-11.
 */
public class MaxCounters {
    public static void main(String[] args) {
        int n=5;
        int[] input={3,4,4,6,1,4,4};
        System.out.println(Arrays.toString(new MaxCounters().solution(n,input)));
    }
    public int[] solution(int n,int[] a){
        int maxCount=0;
        int maxBuffer=0;
        int[] ans=new int[n];
        for(int i=0;i<n;i++)
            ans[i]=0;
        for(int i:a){
            int index=i-1;
            if(i==n+1){
                maxCount=maxBuffer;
            }
            else{
                if(ans[index]<maxCount){
                    ans[index]=maxCount+1;

                }
                else{
                    ans[index]+=1;
                }
                maxBuffer=Math.max(maxBuffer,ans[index]);
            }
        }
        for(int i=0;i<n;i++){
            if(ans[i]<maxCount)
                ans[i]=maxCount;
        }
        return ans;
    }
}
