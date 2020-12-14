package com.lti.Algorithms.Codility.Iterations;

/**
 * Created by busis on 2020-12-09.
 */
public class BinaryGapIterations {
    public static void main(String[] args) {
        int ans;
        ans=new BinaryGapIterations().solution(32);
        System.out.println(ans);
    }
    public int solution(int n){
        /*
        Another Logic could be to find the indices of 1 and then find the gap
         */
        boolean encouteredOne=false;
        int c=0;
        int ans=0;
        int bit=0;
        while (n>0){
            bit =n%2;
            n=n>>1;
            if(bit==0&&encouteredOne){
                c+=1;
            }
            if(bit==1){
                encouteredOne=true;
                if(c>0)
                {
                    ans=Math.max(ans,c);
                    c=0;
                }
            }
        }
        return ans;
    }
}
