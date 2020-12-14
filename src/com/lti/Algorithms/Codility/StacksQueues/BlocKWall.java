package com.lti.Algorithms.Codility.StacksQueues;

import java.util.Stack;

/**
 * Created by busis on 2020-12-14.
 */
public class BlockWall {
    public static void main(String[] args) {
        int a[]={8,8,5,7,9,8,7,4,8};
        System.out.println(solution(a));

    }
    public static int solution(int[] a){
        /*There may already a block that may satisfy your need
        Like both 7's
        If two blocks side by side are equal, they can be made with one block
        Increase in size from the previous will need to add a block
        For decrease in size, we may pop from the stack until we get the same size,
        in which case, we don't need to add a block. Else, if the stack top is less, add
        */
        int blocks=0;
        Stack<Integer> stack=new Stack<Integer>();
        for(int i=0;i<a.length;i++){
            if(!stack.empty()){
                while (!stack.empty()&&stack.peek()>a[i]){
                    int l=stack.pop();
                }
                if(!stack.empty()&&stack.peek()<a[i]){
                    stack.push(a[i]);
                    blocks+=1;
                }
                if(stack.empty()){
                    stack.push(a[i]);
                    blocks+=1;
                }
            }
            else {
                blocks+=1;
                stack.push(a[i]);
            }
        }
        return blocks;
    }
}
