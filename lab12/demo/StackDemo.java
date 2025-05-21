package demo;

import stack.Stack;
import stack.StackArrayimpl;
import stack.Stackimpl;

public class StackDemo {
    public static void main(String[] args){
        Stack stack= new StackArrayimpl();
        stack.push(10);
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("Hello");
        while(!stack.empty()){
            System.out.println(stack.pop());


        }

    }
}
