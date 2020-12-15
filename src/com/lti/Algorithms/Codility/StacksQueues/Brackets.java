package com.lti.Algorithms.Codility.StacksQueues;

import java.util.Stack;

/**
 * Created by busis on 2020-12-13.
 */
public class Brackets {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("[][][]]{[]}"));
    }

}

class Solution{
    public int solution(String s){
        //We can use LinkedList also. It has all the operations that a stack has
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='{' || c=='['||c=='(')
                stack.push(c);
            else{
                if(stack.empty())
                    return 0;
                if(c==']')
                    if(stack.pop()!='[')
                        return 0;
                if(c=='}')
                    if(stack.pop()!='{')
                        return 0;
                if(c==')')
                    if(stack.pop()!='(')
                        return 0;
            }
        }
        //This is a corner case!
        if(!stack.empty())
            return 0;
        return 1;
    }
}