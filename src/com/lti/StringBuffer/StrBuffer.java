package com.lti.StringBuffer;

/**
 * Created by busis on 2020-12-03.
 */
public class StrBuffer {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        //can be empty

        sb.append("Hello");
        sb.append(" World");
        System.out.println(sb);



        sb.delete(0,2);
        //Deletes 0,1
        System.out.println(sb);

        sb.reverse();
        //reverse

        sb.insert(1,"jj");
        //insert at 1 position
        System.out.println(sb);

        StringBuffer sb2=new StringBuffer("Hello");
        StringBuffer sb3=new StringBuffer(sb2);
        sb3.append(" | " + sb2.reverse());

        System.out.println(sb3);
    }
}
