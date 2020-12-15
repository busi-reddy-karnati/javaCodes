package com.lti.Algorithms.Codility.CaterpillarMethod;

import java.util.Arrays;

/*


Sort the array and when we have sorted array, take p,q,r

such that index of p,q,r are in increasing sequence

inherently, r+q>p r+p>q so the only condition we need to check is if p+q>r,
which will guarantee a triangular number

and

if we have
p............q......r
[. represents a number]
if p,q,r satisfy the condition, all the numbers after p , q, r will satisfy

so we can add index(q)-index(p) to the solution and decrement q's index to find more
if a triplet doesn't satisfy, we could check with an increased p, so increment the left pointer


if it satisfies, add the number and then decrement the right and continue


 */
public class CountTriangles {
    public static void main(String[] args) {
        int[] a={10,2,5,1,8,12};
        System.out.println(solution(a));
    }
    public static int solution(int[] a){
        int ans=0;
        int n=a.length;
        Arrays.sort(a);
        int left=0,right=0;
        for(int i=n-1;i>0;i--){
            //We pivot the ith element and in the while loop pivot another
            right=i-1;
            left=0;
            while(left<right){

                //If it satisfies the triangular condition
                if(a[left]+a[right]>a[i]){
                    ans+=right-left;

                    //Since we have added all the cases, we need to check for lesser right
                    //if l,r,i satisfy and l came forward than 0, lesser than l cannot satisfy
                    right--;
                }
                //Otherwise
                else{
                    left+=1;

                }
            }
        }

        return ans;
    }
}
