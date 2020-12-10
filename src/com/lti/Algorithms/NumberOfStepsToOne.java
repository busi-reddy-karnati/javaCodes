package com.lti.Algorithms;

/**
 * Created by busis on 2020-12-10.
 */
public class NumberOfStepsToOne {
    /*
    Given a Binary number. Find the number of steps to reach 1
    If even: div by 2
    else: increment by one
     */
    public static void main(String[] args) {
        int ans=new NumberOfStepsToOne().solution(1101);
        System.out.println(ans);
    }
    public int solution(int a){
        int n;
        String s=Integer.toString(a);
        //Integer wrapper has methods corresponding to integers
        n=Integer.parseInt(s,2);
        int numberOfSteps=0;
        while(n>1){
            numberOfSteps++;
            if(n%2==0)
                n/=2;
            else
                n+=1;
        }
        return numberOfSteps;
    }
}

