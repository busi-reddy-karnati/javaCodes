package com.lti.Algorithms.Codility.CaterpillarMethod;

/**
 * Created by busis on 2020-12-15.
 */
public class AbsDistinct {
    public static void main(String[] args) {
        int a[]={-2147483648, -1, 0, 1};
        System.out.println(solution(a));
    }
    //One approach is to take a set and then keep adding. Return the size.
    //O(n) space and time
    //Lets do O(n) time and O(1) space
    public static int solution(int[] a){
        int n=a.length;
        if(n<2)
            return n;
        int ans=0;
        int leftPointer=0;
        //This is because the Abs of Minimum int overflows int
        while(a[leftPointer]==-2147483648&&leftPointer<n-1){
            leftPointer++;
            ans++;
        }
        int rightPointer=n-1;
        while(leftPointer<rightPointer){
            int val1=Math.abs(a[leftPointer]);
            int val2=Math.abs(a[rightPointer]);
            if(val1==val2)
            {
                while(leftPointer<n-1&&a[leftPointer]==a[leftPointer+1]){
                    leftPointer++;
                }
                if(leftPointer<n-1)
                    leftPointer++;
                while(rightPointer>0&&a[rightPointer]==a[rightPointer-1]){
                    rightPointer--;
                }
                if(rightPointer>0)
                    rightPointer--;
            }
            else if(val1>val2){
                while(leftPointer<n-1&&a[leftPointer]==a[leftPointer+1])
                    leftPointer++;
                if(leftPointer<n-1)
                    leftPointer++;
            }
            else{
                while(rightPointer>0&&a[rightPointer]==a[rightPointer-1])
                    rightPointer--;
                if(rightPointer>0)
                    rightPointer--;
            }
            ans+=1;
        }
        if(leftPointer==rightPointer)
            ans+=1;
        return ans;
    }
}
