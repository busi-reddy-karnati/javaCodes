package com.lti.Collections.Set;

import java.util.Set;
import java.util.StringTokenizer;

/**
 * Created by busis on 2020-12-03.
 */
public class TreeSet {

    public String removeDups(String input){
        StringTokenizer stringTokenizer = new StringTokenizer(input,",");
        Set fruits = new java.util.TreeSet();
        while (stringTokenizer.hasMoreTokens()){
            String fruit = stringTokenizer.nextToken();
            if(!fruits.contains(fruit)){
                fruits.add(fruit);
            }
        }
        String ret="";
        for(Object fruit:fruits){
            ret+=","+fruit;
        }
        return ret.substring(1);
    }
    public int[] removeDupsarr(int[] input){
        //If this was TreeSet, it doesnt accept as it clashes with the class in here
        Set s = new java.util.TreeSet();
        int n=input.length;
        for(int i=0;i<n;i++)
            s.add(input[i]);
        n=s.size();
        int[] ret=new int[n];
        int c=0;
        for(Object i:s){
            ret[c++]= Integer.parseInt(i.toString());
        }
        return ret;


    }
    public static void main(String[] args) {
        //It is same as Hashset but arranges in ascending order
        Set s = new java.util.TreeSet();
        s.add("B");
        s.add("G");
        s.add("A");
        //prints abg
        System.out.println(s);

        String fruits="apple,lichi,apple,mango,lemon,guava,banana,mango";
        System.out.println(new TreeSet().removeDups(fruits));
        int[] arr={12,32,3,1,212,2,3,1,3,8};
        int res[] = new TreeSet().removeDupsarr(arr);
        for(int i=0;i<res.length-1;i++){
            System.out.print(res[i] + ",");
        }
        System.out.println(res[res.length-1]);
    }
}
