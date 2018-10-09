package topic4.assignment2;

/**
 * Created by e083028 on 9/3/2018.
 */
public class Assignment2 {
    public static void main(String[] args) {

        PrintTimeThread prntTime = new PrintTimeThread();

        prntTime.start();

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        prntTime.stopThread();
    }
}
