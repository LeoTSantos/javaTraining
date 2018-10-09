package topic2.assignment1;

/**
 * Created by e083028 on 8/27/2018.
 */
public class Book {

    private String isbn;
    private String title;
    private String author;
    private double price;

    public Book(String isbn, String title, String author, double price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayData() {
        System.out.print("isbn: " + isbn + "\n" +
                "title: " + title + "\n" +
                "author: " + author + "\n" +
                "price: " + price + "\n\n");
    }

    public double discountedPrice(double discountPercent) {
        return price - (price * discountPercent/100);
    }
}
