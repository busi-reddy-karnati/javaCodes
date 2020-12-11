package com.lti.Algorithms;

/**
 * Created by busis on 2020-12-11.
 */
public class TwoStringsAnagram {
    public static void main(String[] args) {
        System.out.println(solution("abc","cde"));
    }
    public static int solution(String s1,String s2){
        int ans=0;
        int[] firstStringChars=new int[26];
        int[] secondStringChars=new int[26];
        for(int i=0;i<s1.length();i++)
            firstStringChars[s1.charAt(i)-'a']+=1;
        for(int i=0;i<s2.length();i++)
            secondStringChars[s2.charAt(i)-'a']+=1;
        for(int i=0;i<26;i++){
            int minFreq=Math.min(firstStringChars[i],secondStringChars[i]);
            ans+=(firstStringChars[i]-minFreq);
            ans+=(secondStringChars[i]-minFreq);
        }
        return ans;
    }
}
