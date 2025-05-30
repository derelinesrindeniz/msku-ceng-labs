package generics.stack;



public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new StackArrayImpl<Integer>();
        stack.push(10);
        stack.push(5);
        stack.push(4);
        stack.push(2);
        stack.push(1);
        System.out.println(stack.toLİst());
        //stack.pop();
        //System.out.println(stack.pop());
        //while(!stack.empty()){
            //System.out.println(stack.pop());
        //}
    }
}