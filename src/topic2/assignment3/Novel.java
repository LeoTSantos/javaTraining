package topic2.assignment3;

/**
 * Created by e083028 on 8/28/2018.
 */
public class Novel extends Book {
    private String author;

    public Novel(String isbn, String title, double price, String author) {
        super(isbn, title, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String toString() {
        return super.toString() + "Author: " + author + "\n\n";
    }
}
