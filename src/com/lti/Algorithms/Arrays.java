package com.lti.Algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by busis on 2020-12-09.
 */
public class Arrays {

    public int[] swapSort(int[] input){
        for(int i=0;i<input.length;i++){
            String s;
            s=Integer.toString(input[i]);
            StringBuffer sb = new StringBuffer(s);
            sb=sb.reverse();
            input[i]=Integer.parseInt(sb.toString());
        }
        java.util.Arrays.sort(input);
        return input;
    }
    static char[] moveVowels(String input){
        StringBuffer stringBuffer=new StringBuffer(input);
        StringBuffer stringBuffer1=new StringBuffer();
        int insertIndex=0;
        for(int i=0;i<stringBuffer.length();i++){
            char c= stringBuffer.charAt(i);
            if("aeiou".indexOf(Character.toLowerCase(c))>=0){
                stringBuffer1.insert(insertIndex,c);
                insertIndex++;
            }
            else
                stringBuffer1.append(c);



        }
        char[] ans=new char[stringBuffer.length()];
        stringBuffer1.getChars(0,stringBuffer.length(),ans,0);
        return ans;
    }
    public static void main(String[] args) {
        int num[] = new int[10];
        //We don't give the size here

        // We can declare afterwards also
        num=new int[10];


        List<Integer> s = new ArrayList<Integer>();

        //ArrayList to object array
        Object[] ars = s.toArray();


        //IF you want to remove the duplicates, add it to the set and then add it to array
        s.add(10);
        s.add(20);
        s.add(30);

        //Adding the elements of an ArrayList to an array
        int[] arr2;
        arr2=new int[s.size()];
        for (int i=0;i<s.size();i++){
            //Get the indexed element in Array list using the get method
            arr2[i]=s.get(i);
        }

        Arrays arrays = new Arrays();
        int[] input={12,34,35,16,19,27};
        int[] result=arrays.swapSort(input);
        for(int r:result)
            System.out.println(r);

        String inl="AlPha";
        System.out.println(arrays.moveVowels(inl));
    }
}
