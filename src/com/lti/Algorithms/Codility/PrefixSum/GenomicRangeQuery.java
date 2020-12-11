package com.lti.Algorithms.Codility.PrefixSum;

import java.util.Arrays;

/**
 * Created by busis on 2020-12-11.
 */
public class GenomicRangeQuery {
    public static void main(String[] args) {
        int[] p={2,5,0};
        int[] q={4,5,6};
        String s="CAGCCTA";
        System.out.println(Arrays.toString(new GenomicRangeQuery().solution(s, p, q)));
    }

    public int[] solution(String s, int[] p, int[] q){
        int queries=p.length;
        int[] ans=new int[queries];

        return ans;
    }

}
