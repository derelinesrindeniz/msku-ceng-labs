package stack;

import java.util.ArrayList;

public class StackArrayimpl {
    public class StackArrayImpl extends Stack {
        private ArrayList<Object> stack= new ArrayList<Object>();

        @Override
        public void push(Object item){
            stack.add(0,item);
        }


        @Override
        public boolean empty() {
            return stack.size()==0 ;
        }

        @Override
        public Object pop() {

            return stack.remove(0);
        }
    }
}
