package com.lti.Collections;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by busis on 2020-12-03.
 */
public class Generics {
    //Generics are collections where we mention the datatype

    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<Integer>();
        ar.add(10);
        ar.add(20);
        ar.add(30);


        //One type of for
        for(int i=0;i<ar.size();i++)
            System.out.println(ar.get(i));



        for(int i:ar)
            System.out.println(i);

        //Iterator
        Iterator<Integer> it = ar.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //Forward Iterator
        ListIterator<Integer> lit = ar.listIterator();
        while (lit.hasNext()){
            System.out.println(lit.next());
        }

        //Backward itertor
        while (lit.hasPrevious()){
            System.out.println(lit.previous());
        }
    }
}
