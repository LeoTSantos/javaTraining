package topic2.assignment3;

/**
 * Created by e083028 on 8/28/2018.
 */
public class Assignment3 {
    public static void main(String[] args) {
        Magazine magazine = new Magazine("000001", "IEEExplore", 15.50, "Scientific Journal");
        Novel novel = new Novel("000002", "The Caves of Steel", 20.00, "Isaac Asimov");

        magazine.read();

        novel.read();
    }
}
