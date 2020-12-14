package com.lti.Algorithms.Codility.Arrays;


public class ArrayRotationArrays {
    public static void main(String[] args) {
        /*
        * Number of rotations with the array. A rotation means taking the last and putting
        * in the front
        * */
        int a[]={3,8,9,7,6};
        int k=3;
        //This will be problematic while n = 0. Coz if n=0, %0 is essentially div by zero
        //Which is an exception
        //So add this
        /*
        *if(n==0)
         * return a;
        * */
        int [] ans;
        ans=new ArrayRotationArrays().solution(a,k);
        int n=a.length;
        //You could also use collections.rotate
        for(int i=0;i<n;i++)
            System.out.println(ans[i]);
    }
    public int[] solution(int[] a, int k){
        int n=a.length;

        int ans[] = new int[n];
        if(n==0)
            return ans;
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
        return ans;
    }
}
