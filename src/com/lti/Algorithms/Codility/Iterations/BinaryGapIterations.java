package com.lti.Algorithms.Codility.Iterations;

/**
 * Created by busis on 2020-12-09.
 */
public class BinaryGapIterations {
    public static void main(String[] args) {
        int n=19;
        boolean encouteredOne=false;
        int c=0;
        int ans=0;
        while (n>0){
            int i=n%2;
            n=n>>1;
            if(i==0&&encouteredOne){
                c+=1;
            }
            if(i==1){
                encouteredOne=true;
                if(c>0)
                {
                    ans=Math.max(ans,c);
                    c=0;
                }
            }
        }
        System.out.println(ans);
    }
}
