package gr.aueb.cf.ch16;

/**
 * @author Ntirintis John
 */
public class MarkerApp {
    public static void main(String[] args) {
        Item book = new Book(1, "12345", "George O.", "1984");
        Item cd = new CompactDisk(1, "AC/DC");

        deliver(book);
    }

    public static void deliver(Item item){
        if(item instanceof  Book){
            System.out.println("Book Delivered");
        } else if (item instanceof CompactDisk){
            System.out.println("CD Delivered");
        } else {
            throw new AssertionError(item);
        }
    }
}
