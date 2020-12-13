package com.lti.Algorithms.Codility.PrefixSum;

/**
 * Created by busis on 2020-12-13.
 */
public class MinAvgTwoSlice {
    public static void main(String[] args) {
        //https://github.com/daotranminh/playground/blob/master/src/codibility/MinAvgTwoSlice/proof.pdf
        //Proof that the minSlice will be 2-3\
        int[] a={4,2,2,5,1,5,8};
        System.out.println(new MinAvgTwoSlice().solution(a));

    }
    public int solution(int[] a){
        double minAverage= Double.MAX_VALUE;
        int n=a.length;
        int minIndex=-1;
        for(int i=0;i<n-2;i++){
            double avg2=0,avg3=0;
            avg2=(a[i]+a[i+1])/2.0;
            avg3=(a[i]+a[i+1]+a[i+2])/3.0;
            //Divide by 3.0 not 3. Coz of the double value
            double minLocalAverage = Math.min(avg2,avg3);
            if(minLocalAverage<minAverage){
                minAverage=minLocalAverage;
                minIndex=i;
            }
        }
        if(n>1){
            double avg=(a[n-1]+a[n-2])/2;
            if(avg<minAverage)
                return n-2;
        }
        return minIndex;
    }
}
