package com.lti.Algorithms;

/**
 * Created by busis on 2020-12-10.
 */
public class PrimeIndexSum {
    static boolean prime[] = new boolean[1001];


    public static void main(String[] args) {
        int[] input={1,2,3,4,5,6,7,8,9,10};
        new PrimeIndexSum().sieveOfEratosthenes(1000);
        System.out.println(new PrimeIndexSum().solution(input));
    }

    public float solution(int[] a){
        int sum=0;
        int count=0;
        for(int i=0;i<a.length;i++){
            if(prime[i]){
                sum+=a[i];
                count++;
            }
        }
        if(count==0)
            return 0;
        return sum/count;
    }


    public void sieveOfEratosthenes(int n)
    {
        //Do not give this an anonymous block
        //Or better give the prime array as static
        for(int i=0;i<n;i++)
            prime[i] = true;
        prime[0]=false;
        prime[1]=false;
        for(int p = 2; p*p <=n; p++)
        {
            if(prime[p] == true)
            {
                for(int i = p*p; i <= n; i += p)
                    prime[i] = false;
            }
        }
    }


    //This is another way to find the prime number
    public boolean isPrime(int n){
        if(n<2)
            return false;
        if(n==2)
            return true;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
