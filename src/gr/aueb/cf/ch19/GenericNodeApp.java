package gr.aueb.cf.ch19;

/**
 * @author Ntirintis John
 */
public class GenericNodeApp {
    public static void main(String[] args) {
        GenericNode<Integer> nodeInt = new GenericNode<>();
        GenericNode<String> nodeStr = new GenericNode<>();

        nodeInt.setValue(3);
        nodeStr.setValue("CF 2023");
    }
}
