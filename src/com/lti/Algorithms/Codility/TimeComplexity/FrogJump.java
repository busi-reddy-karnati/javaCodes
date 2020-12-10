package com.lti.Algorithms.Codility.TimeComplexity;

/**
 * Created by busis on 2020-12-10.
 */
public class FrogJump {
    public static void main(String[] args) {
        System.out.println(new FrogJump().solution(3,999111321,7));
    }
    //Giving Float can give a wrong answer
    public int solution(int x, int y, int d){
        return (int)Math.ceil((double)(y-x)/(double)d);
    }
}
