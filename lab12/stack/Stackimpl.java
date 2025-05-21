package stack;

public class Stackimpl implements Stack{
    StackItem top=null;

    @Override
    public void push(Object item){
        StackItem box=new StackItem(item);
        StackItem previousTop= top;
        top=box;
        top.setNext(previousTop);
    }
    @Override
    public Object pop(){
        StackItem oldTop= top;
        top = oldTop.getNext();
        return oldTop.getItem();

    }

    @Override
    public boolean empty(){
        return top== null;
    }
}
