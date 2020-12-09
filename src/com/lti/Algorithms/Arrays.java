package com.lti.Algorithms;

import java.util.*;

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
    public String[] sortByAge(String []input){
        Collections.sort(java.util.Arrays.asList(input),new compareTwoStrings());
        return input;
    }


    public static void main(String[] args) {
        String input11[]={"Ben-12","hun-15","Gen-14"};
        Arrays arrays=new Arrays();
        input11=arrays.sortByAge(input11);
        for(String s:input11)
            System.out.println(s);
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

        int[] input={12,34,35,16,19,27};
        int[] result=arrays.swapSort(input);
        for(int r:result)
            System.out.println(r);

        String inl="AlPha";
        System.out.println(arrays.moveVowels(inl));
    }
}
class compareTwoStrings implements Comparator<String>{


    @Override
    public int compare(String o1, String o2) {
        StringTokenizer stringTokenizer=new StringTokenizer(o1,"-");
        StringTokenizer stringTokenizer1=new StringTokenizer(o2,"-");
        int n1 = 0;
        int n2 = 0;
        String buffer;
        /*sai-22
                bhargav-21*/
        if(stringTokenizer.hasMoreTokens())
            buffer=stringTokenizer.nextToken();//sai
        if(stringTokenizer.hasMoreTokens())
            n1=Integer.parseInt(stringTokenizer.nextToken());//22
        if(stringTokenizer1.hasMoreTokens())
            buffer=stringTokenizer1.nextToken();//bhargav
        if(stringTokenizer1.hasMoreTokens())
            n2=Integer.parseInt(stringTokenizer1.nextToken());//21


        return (n1-n2);
    }
}