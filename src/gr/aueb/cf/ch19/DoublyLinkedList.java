package gr.aueb.cf.ch19;

import java.security.CodeSigner;

/**
 * @author Ntirintis John
 */
public class DoublyLinkedList<T> {
    private GenericNode<T> head;
    private GenericNode<T> tail;

    public DoublyLinkedList(){
        head = tail = null;
    }

    public void insertFront(T t){
        GenericNode<T> tmp = new GenericNode<T>();
        tmp.setValue(t);
        tmp.setPrev(null);
        tmp.setNext(head);

        head = tmp;
        if (tmp.getNext() == null){
            tail = tmp;
        } else {
            tmp.getNext().setNext(tmp);
        }
    }

    public void insertEnd(T t){
        GenericNode<T> tmp = new GenericNode<T>();
        tmp.setValue(t);
        tmp.setNext(null);
        tmp.setPrev(tail);

        tail = tmp;
        if(tmp.getPrev() == null){
            head = tmp;
        } else {
            tmp.getPrev().setNext(tmp);
        }
    }

    /**
     * Time Complexity O(1)
     *
     */
    public void deleteFront(){
        if(isEmpty()) return;
        if(head.getNext() == null){
            head = tail = null;
        } else  {
            head = head.getNext();
            head.setPrev(null);
        }
    }

    public void deleteEnd(){
        if (isEmpty()) return;

        // if only one element is in the list
        if(head.getNext() == null){
                head = tail = null;
        } else {
            tail = tail.getPrev();
            tail.setNext(null);
        }
    }

    public GenericNode<T> get(T t){
        for (GenericNode<T> n = head; n != null; n = n.getNext()){
            if(n.getValue().equals(t)){
                return n;
            }
        }
        return null;
    }

    public void traverse(){
        for(GenericNode<T> n = head; n != null; n = n.getNext()){
            System.out.println(n);
        }
    }

    public boolean isEmpty(){
        return (head == null) && (tail == null);
    }
}
