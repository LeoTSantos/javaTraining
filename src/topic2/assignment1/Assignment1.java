package topic2.assignment1;

/**
 * Created by e083028 on 8/27/2018.
 */
public class Assignment1 {
    public static void main(String[] args) {
        Book tlotr = new Book("00001", "The Lord of the Rings", "J. R. R. Tolkien", 30.00);

        tlotr.displayData();

        System.out.println("Discounted price: " + tlotr.discountedPrice(30));
    }
}
