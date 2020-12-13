package com.lti.Algorithms.Codility.PrefixSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class GenomicRangeQuery {
    public static void main(String[] args) {
        int[] p={2,5,0};
        int[] q={4,5,6};
        String s="CAGCCTA";
        System.out.println(Arrays.toString(new GenomicRangeQuery().solution(s, p, q)));
    }

    public int[] solution(String s, int[] p, int [] q){
        int queries=p.length;
        int[] ans=new int[queries];
        int strLen=s.length();
        int[][] freq=new int[strLen+1][4];
        freq[0][0]=0;
        freq[0][1]=0;
        freq[0][2]=0;
        freq[0][3]=0;
        Map<Character,Integer> map=new HashMap<Character, Integer>();
        map.put('A',0);
        map.put('C',1);
        map.put('G',2);
        map.put('T',3);
        for(int i=0;i<strLen;i++){
            int index=i+1;
            for(int j=0;j<4;j++){
                freq[index][j]=freq[index-1][j];
            }
            char c = s.charAt(i);
            int mapIndex=map.get(c);
            freq[index][mapIndex]+=1;
        }

        for(int i=0;i<queries;i++){
            int a=p[i];
            int b=q[i]+1;
            for(int j=0;j<4;j++){
                if(freq[b][j]>freq[a][j]) {
                    ans[i] = j + 1;
                    break;
                }
            }
        }
        return ans;
    }

}
