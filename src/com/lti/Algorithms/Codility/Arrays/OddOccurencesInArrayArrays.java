package com.lti.Algorithms.Codility.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by busis on 2020-12-10.
 */
public class OddOccurencesInArrayArrays {
    public static void main(String[] args) {
        int[] input={9,3,9,3,9,9,7};
        System.out.println(new OddOccurencesInArrayArrays().solution(input));
    }
    public int solution(int[] A){
        //A bit wise XOR can be used to solve this.
        //That gives constant space and linear time complexity
        Map<Integer,Integer> map=new HashMap<Integer, Integer>();
        for(int i:A){
            if(map.containsKey(i)){
                int v=map.get(i);

                map.replace(i,v+1);
            }
            else {
                map.put(i,1);
            }
        }
        Set<Integer> keySet=map.keySet();
        for(int key:keySet){
            if(map.get(key)%2==1)
                return key;
        }
        return 0;
    }
}
