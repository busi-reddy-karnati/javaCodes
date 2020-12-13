package com.lti.Algorithms.Codility.Sorting;
import java.util.Arrays;
/**
 * Created by busis on 2020-12-13.
 */
public class TriangularTriplet {
    public static void main(String[] args) {
        int a[]={10,2,5,1,8,20};
        System.out.println(new Solution().solution(a));
    }
}
class Solution{
    public int solution(int[] a) {
        int n=a.length;
        Arrays.sort(a);
        for(int i=0;i<n-2;i++){
            if(a[i]>a[i+2]-a[i+1])
                return 1;
        }
        return 0;
    }
}