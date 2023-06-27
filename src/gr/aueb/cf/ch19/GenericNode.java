package gr.aueb.cf.ch19;

/**
 * @author Ntirintis John
 */
public class GenericNode<T> {

    private T value;
    private GenericNode<T> next;
    private GenericNode<T> prev;

    public GenericNode() {}

    public GenericNode(T value) {
        this.value = value;
    }

    public GenericNode(T value, GenericNode<T> next, GenericNode<T> prev) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public GenericNode<T> getNext() {
        return next;
    }

    public void setNext(GenericNode<T> next) {
        this.next = next;
    }

    public GenericNode<T> getPrev() {
        return prev;
    }

    public void setPrev(GenericNode<T> prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "GenericNode{" +
                "value=" + value +
                '}';
    }
}
