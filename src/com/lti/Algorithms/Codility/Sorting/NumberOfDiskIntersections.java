package com.lti.Algorithms.Codility.Sorting;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by busis on 2020-12-13.
 */
public class NumberOfDiskIntersections {
    public static void main(String[] args) {
        int[] a={1,5,2,1,4,0};
        System.out.println(new NumberOfDiskIntersections().solution(a));
    }
    public int solution(int[] a){
        int ans=0;
        int minStartingPoint=Integer.MAX_VALUE,maxEndingPoint=Integer.MIN_VALUE;
        Map<Integer,Integer> startMap=new HashMap<Integer, Integer>();
        Map<Integer,Integer> endMap=new HashMap<Integer, Integer>();
        for(int i=0;i<a.length;i++){
            int sp=i-a[i];
            int ep=i+a[i];
            if(sp<minStartingPoint){
                minStartingPoint=sp;
                startMap.put(sp,1);
            }

            if(ep>maxEndingPoint)
                maxEndingPoint=ep;
        }
        int numberOfActiveCircles=0;

        for(int i=minStartingPoint;i<=maxEndingPoint;i++){
            startMap.put(i,0);
            endMap.put(i,0);
        }
        for(int i=0;i<a.length;i++){
            int sp=i-a[i];
            int ep=i+a[i];
            int sValue=startMap.get(sp);
            int eValue=endMap.get(ep);
            startMap.replace(sp,sValue+1);
            endMap.replace(ep,eValue+1);
        }
        for(int i=minStartingPoint;i<=maxEndingPoint;i++){
            int x=startMap.get(i);
            ans+=(numberOfActiveCircles*x)+((x*(x-1))/2);
            if(ans>1E7)
                return -1;
            numberOfActiveCircles+=x;
            numberOfActiveCircles-=endMap.get(i);
        }
        return ans;
    }
}
