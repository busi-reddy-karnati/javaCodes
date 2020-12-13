package com.lti.Algorithms.Codility.StacksQueues;

import java.util.Stack;

class Solution1 {

    public int solution(int[] a, int[] b) {
        int fishAlive = a.length;
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < a.length; i++) {
            //If the fish is going downstream, let it go.
            if (b[i] == 1)
                stack.push(a[i]);
            //If the fish are going, they have to either eat or get eaten
            else {
                while (!stack.empty()) {
                    if (stack.peek() > a[i]) {//Get eaten
                        fishAlive -= 1;
                        break;
                    }
                    else {//Eat the other fish
                        int n=stack.pop();
                        fishAlive-=1;
                    }
                }
            }

        }
        return fishAlive;
    }
}
public class Fish {
    public static void main(String[] args) {

        int a[] = {4, 3, 2, 1, 5};
        int b[] = {0, 1, 0, 0, 0};
        System.out.println(new Solution1().solution(a,b));
    }

}
