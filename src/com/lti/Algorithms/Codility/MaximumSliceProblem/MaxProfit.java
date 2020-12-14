package com.lti.Algorithms.Codility.MaximumSliceProblem;

/**
 * Created by busis on 2020-12-14.
 */
public class MaxProfit {
    public static void main(String[] args) {
        int[] a={23171,21011,21123,21366,21013,21367};
        System.out.println(solution(a));
    }
    public static int solution(int[] a){
        /*
        The trick is, while you are traversing, we may have well bought the stock for minPrice
        Assuming that, what would have been the profit till this point
         */
        int ans=0;
        int minElement=2000001;
        for(int i=0;i<a.length;i++){
            if(a[i]<minElement)
                minElement=a[i];
            if(a[i]-minElement>ans)
                ans=a[i]-minElement;
        }

        return ans;
    }
}
