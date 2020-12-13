package com.lti.Algorithms.Codility.PrefixSum;

/**
 * Created by busis on 2020-12-13.
 */
public class PassingCars {
    public static void main(String[] args) {
        int[] a={0,1,0,1,1};
        System.out.println(new PassingCars().solution(a));
    }
    public int solution(int[] a){
        int ans=0;
        int carsGoingRight=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==1){

                ans+=carsGoingRight;
                if(ans>1000000000)
                    return -1;
            }
            else
                carsGoingRight+=1;
        }

        return ans;
    }
}
