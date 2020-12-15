package com.lti.Algorithms.Codility.EuclideanAlgorithm;

/**
 * Created by busis on 2020-12-14.
 */
public class ChocolateByNumbers {
    public static void main(String[] args) {
        System.out.println(solution(947853, 4453));
    }
    public static int gcd(int a, int b){
        if(b==0)
            return a;
        int ans=gcd(b,a%b);
        return gcd(b,a%b);
    }
    public static long lcm(int a,int b){
        int g=gcd(a,b);
        //Multiplying two int gives int s, type cast them to be able to get long
        long ans=((long)((long)a*(long)b)/(long)g);
        return ans;
    }
    public static int solution(int n, int m){
        long ans=lcm(n,m)/m;
        return (int)ans;
    }
}
