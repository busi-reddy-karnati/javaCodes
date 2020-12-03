package com.lti.Collections.Set;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by busis on 2020-12-03.
 */
public class HasheSet {
    public static void main(String[] args) {
        Set s = new HashSet();
        s.add("sachin");
        s.add("dravid");
        s.add("sachin");//doesn't insert


        s.clear();//removes the object


        s.remove("sachin");
        //removes sachin

        Set s2 = new HashSet();
        s.add("sachin");
        s.add("dravid");
        s.add("sachin");
        s2.addAll(s);
        System.out.println(s2);

        //Since all are collections, they are
        for(Object i:s){
            System.out.println(i);
        }
    }
}
