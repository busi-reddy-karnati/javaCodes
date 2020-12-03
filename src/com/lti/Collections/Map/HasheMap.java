package com.lti.Collections.Map;

import java.util.*;

/**
 * Created by busis on 2020-12-03.
 */
public class HasheMap {
    //Find who all passed
    public List<String> getPassList(Map<String,Integer> input){
        List<String> ans = new ArrayList<String>();
        Set<String> ks = input.keySet();
        for(String s:ks){
            if(input.get(s)>70)
                ans.add(s);
        }

        return ans;
    }

    //Find occurances of digits
    public Map<Character,Integer> getFrequency(String input){
        Map<Character,Integer> ans = new HashMap<Character, Integer>();
        for(int i=0;i<input.length();i++){
            if(ans.containsKey(input.charAt(i))){
                int n=ans.get(input.charAt(i));
                ans.put(input.charAt(i),n+1);

            }
            else{
                ans.put(input.charAt(i),1);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1,"Sachin");
        map.put(2,"Dravid");
        //Insert into the HashMap
        map.put(3,"Ganguly");
        System.out.println(map);

        //This gives the set of keys
        Set<Integer> ks = map.keySet();
        System.out.println(ks);

        Collection<String> vals = map.values();
        //Return method of values is collection
        System.out.println(vals);

        System.out.println(map.entrySet());
        //Same like printing the map. but in list we get


        map.remove(3);
        //Removes Ganguly

        System.out.println(map);
        Map<String,Integer> map1=new HashMap<String, Integer>();

        map1.put("Anna",90);
        map1.put("Pappu",50);
        map1.put("Kichu",78);
        map1.put("Drogs",56);
        System.out.println(new HasheMap().getPassList(map1));

        System.out.println(new HasheMap().getFrequency("apple"));
    }
}
