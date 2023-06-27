package gr.aueb.cf.ch19.collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.function.Consumer;

/**
 * @author Ntirintis John
 */
public class MyStack<T> {
    private final Deque<T> myStack = new LinkedList<>();

    public MyStack(){}

    public Deque<T> getMyStack() {
        return myStack;
    }

    public void push(T t){
        myStack.push(t);
    }

    public T pop(){
        return myStack.pop();
    }

    public void forEach(Consumer<T> action){
        myStack.forEach(action);
    }
}
