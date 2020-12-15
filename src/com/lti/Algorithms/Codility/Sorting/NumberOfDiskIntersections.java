package com.lti.Algorithms.Codility.Sorting;

import java.util.*;
/*
Takeaway: Try and reduce the number of HashMaps used. Use arrays instead
 */
public class NumberOfDiskIntersections {
    public static void main(String[] args) {
        int[] a={1,5,2,1,4,0};
        System.out.println(solution2(a));
    }
    public static int solution2(int[] a){
        int ans=0;
        Set<Integer> points=new TreeSet<Integer>();
        Map<Integer,Integer> staringPointsCount=new HashMap<Integer, Integer>();
        Map<Integer,Integer> endingPointsCount=new HashMap<Integer, Integer>();
        for(int i=0;i<a.length;i++){
            int sp=i-a[i];
            int ep=i+a[i];
            points.add(sp);
            points.add(ep);
            staringPointsCount.put(sp, staringPointsCount.containsKey(sp) ? staringPointsCount.get(sp) + 1 : 1);
            endingPointsCount.put(ep,endingPointsCount.containsKey(ep)?endingPointsCount.get(ep)+1:1);
        }
        int numberOfActiveCircles=0;
        for(int point:points){
            int num=staringPointsCount.containsKey(point)?staringPointsCount.get(point):0;
            ans+=num*numberOfActiveCircles;
            ans+=(num)*(num-1)*0.5;
            numberOfActiveCircles+=num;
            numberOfActiveCircles-=endingPointsCount.containsKey(point)?endingPointsCount.get(point):0;
        }
        if(ans>1000000)
            return -1;
        return ans;
    }
    public static int correctSolution(int[] A){
        int maxInter = 10000000;
        int N = A.length;
        int [] discStartPoint = new int [N];
        int [] discEndPoint = new int [N];

        for (int i = 0; i < N; i++) {

            discStartPoint[i] = i - A[i];
            if (Integer.MAX_VALUE - A[i] < i)
                discEndPoint[i]=Integer.MAX_VALUE;

            else {discEndPoint[i] = i + A[i]; }

        }

        Arrays.sort(discStartPoint);
        Arrays.sort(discEndPoint);

        int startPointIndex= 0;
        int endPointIndex = 0;
        int openDiscs = 0;
        int intersections = 0;

        while(startPointIndex < N) {

            if (discStartPoint[startPointIndex] <= discEndPoint[endPointIndex]) {
                intersections = intersections + openDiscs;

                if (intersections > maxInter) {
                    return -1;
                }
                openDiscs++;
                startPointIndex++;
            }
            else{
                openDiscs--;
                endPointIndex++;
            }

        }

        return intersections;
    }
    public int solution(int[] a){
        int ans=0;
        int minStartingPoint=Integer.MAX_VALUE;
        int maxEndingPoint=Integer.MIN_VALUE;
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
            if(ans>10E6)
                return -1;
            numberOfActiveCircles+=x;
            numberOfActiveCircles-=endMap.get(i);
        }
        return ans;
    }
}
