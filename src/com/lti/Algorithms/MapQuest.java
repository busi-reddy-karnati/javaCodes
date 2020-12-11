package com.lti.Algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by busis on 2020-12-11.
 */
public class MapQuest {
    public static void main(String[] args) {
        Map<String,Integer> engFB = new HashMap<String, Integer>();
        engFB.put("anna",90);
        engFB.put("rhema",70);
        engFB.put("drik",45);
        Map<String,Integer> matFC=new HashMap<String, Integer>();
        matFC.put("anna",89);
        matFC.put("john",45);
        matFC.put("drik",100);
        Map<String,Integer> ans=new MapQuest().getMaxAvg(engFB,matFC);
        for(String s: ans.keySet()){
            System.out.println(s+" "+ans.get(s));
        }


    }
    Map<String,Integer> getMaxAvg(Map<String,Integer> engFB, Map<String,Integer> matFB){
        Map<String,Integer> ans=new HashMap<String, Integer>();
        ans.putAll(engFB);
        for(String s:matFB.keySet()){
            if(ans.containsKey(s)){
                ans.replace(s,Math.max(engFB.get(s),matFB.get(s)));
            }
            else
                ans.put(s,matFB.get(s));
        }
        return ans;
    }
}
