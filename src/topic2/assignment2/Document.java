package topic2.assignment2;

/**
 * Created by e083028 on 8/27/2018.
 */
public class Document {
    protected String text;

    public String toString(){
        return text;
    }

    public void read() {
        System.out.println(this.toString());
    }

    public void write(String newText) {
        this.text = newText;
    }
}
