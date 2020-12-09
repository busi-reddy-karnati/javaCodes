package com.lti.Algorithms.Codility.Arrays;

/**
 * Created by busis on 2020-12-09.
 */
public class ArrayRotationArrays {
    public static void main(String[] args) {
        int a[]={3,8,9,7,6};
        int k=3;

        int n=a.length;
        //This will be problematic while n = 0. Coz if n=0, %0 is essentially div by zero
        //Which is an exception
        //So add this
        /*
        *if(n==0)
         * return a;
        * */
        int ans[] = new int[n];
        k=k%n;
        int startIndex=n-k;
        int index=0;
        for(int i=startIndex;i<n;i++){
            ans[index]=a[i];
            index++;
        }
        for(int i=0;i<startIndex;i++){
            ans[index]=a[i];
            index++;
        }
        for(int i=0;i<n;i++)
            System.out.println(ans[i]);
    }
}
