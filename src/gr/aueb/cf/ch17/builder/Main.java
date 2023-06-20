package gr.aueb.cf.ch17.builder;

/**
 * @author Ntirintis John
 */
public class Main {
    public static void main(String[] args) {
        Book book = new Book.Builder(1234, "5678").build();
        Book book2 = new Book.Builder(1212, "789").Author("John N.").Title("1984").build();
    }
}
