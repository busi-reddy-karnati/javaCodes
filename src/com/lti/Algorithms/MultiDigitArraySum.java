package com.lti.Algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by busis on 2020-12-10.
 */
public class MultiDigitArraySum {
    public static void main(String[] args) {
        int[] a={12,34,56,91,45,11,77};
        System.out.println(new MultiDigitArraySum().giveMaxMinSumV1(a));
        System.out.println(new MultiDigitArraySum().giveMaxMinSumV2(a));
    }
    public static int giveMaxMinSumV1(int[] a){
        /*
        * Find the minimum and maximum and find the sum and return that
        * in version2, find the frequency of minimum and maximum and multiply with that
        * */
        int min=10;
        int max=-1;
        for(int i:a){
            int buff=i;
            while(buff>0){
                int j=buff%10;
                buff/=10;
                if(j<min)
                    min=j;
                if(j>max)
                    max=j;
            }
        }
        return max+min;
    }
    public static int giveMaxMinSumV2(int[] a){
        Map<Integer,Integer> map = new HashMap<Integer, Integer>(0);
        //We don't need a HashMap also.
        //We can count the number of mins in the same loop and add
        for(int i=0;i<10;i++)
            map.put(i,0);
        int min=10;
        int max=-1;
        for(int i:a){
            int buff=i;
            while(buff>0){

                int j=buff%10;

                int val;
                val = map.get(j);
                map.replace(j,val+1);
                buff/=10;
                if(j<min)
                    min=j;
                if(j>max)
                    max=j;
            }
        }
        return max*map.get(max)+min*map.get(min);

    }

}

