package com.lti.Collections.List;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by busis on 2020-12-03.
 */
public class ArrList {
    public static void main(String[] args) {
        List arr = new ArrayList();
        arr.add(10);
        arr.add("Sachin");
        arr.add(283);
        arr.add(1,"333");
        //insert at index 1

        List arr2 = new ArrayList();
        arr2.addAll(arr);
        //Add all the elements in another collection

        //ArrayList isn't thread safe: if many threads were executing, we cannot
        //cannot guarantee exclusion


        System.out.println(arr);
        //print the ArrayList


        //Deletes all the elements in the list
        arr2.clear();
        System.out.println(arr2);


        arr.contains(10);
        //check whether 10 is there in arr


        System.out.println(arr.get(1));
        //returns the object at 1 index

        //Gives first occurence of 10
        int ind=arr.indexOf(10);

        int ind2 = arr.lastIndexOf(10);
        //last index of 10

        int s= arr.size();
        //returns size of the arr


        arr.remove(10);
        //Removes object

        //accept a string containing fruits list as comma separated
        //Store them in an Array List
        String fruits="apple,lichi,apple,mango,lemon,guava,banana,mango";
        StringTokenizer stringTokenizer = new StringTokenizer(fruits,",");
        List fruitList = new ArrayList();
        while(stringTokenizer.hasMoreTokens()){
            String fName = stringTokenizer.nextToken();
            if(!fruitList.contains(fName)){
                fruitList.add(fName);
            }
        }
        System.out.println(fruitList);


    }
}
