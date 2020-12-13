package com.lti.Algorithms.Codility.StacksQueues;

import java.util.Stack;

/**
 * Created by busis on 2020-12-13.
 */
class Solution2{
    public int solution(String s){
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')
                stack.push('(');
            else {
                if(stack.empty())
                    return 0;
                else if(stack.pop()!='(')
                        return 0;

            }
        }
        if(!stack.empty())
            return 0;
        return 1;
    }

}
public class Nesting {
    public static void main(String[] args) {
        System.out.println(new Solution2().solution("((()()))"));
    }
}
