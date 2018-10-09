package topic2.assignment3;

/**
 * Created by e083028 on 8/28/2018.
 */
public class Magazine extends Book {

    private String type;

    public Magazine(String isbn, String title, double price, String type) {
        super(isbn, title, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return super.toString() + "Type: " + type + "\n\n";
    }
}
