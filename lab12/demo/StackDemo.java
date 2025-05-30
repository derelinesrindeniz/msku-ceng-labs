package demo;

import stack.Stack;
import stack.StackArrayImpl;
import stack.StackImpl;

public class StackDemo {
    public static void main(String[] args) {
        //Stack stack = new StackImpl();
        Stack stack = new StackArrayImpl();
        stack.push(10);
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("Hello");
        //stack.pop();
        //System.out.println(stack.pop());
        while(!stack.empty()){
            System.out.println(stack.pop());
        }
    }
}