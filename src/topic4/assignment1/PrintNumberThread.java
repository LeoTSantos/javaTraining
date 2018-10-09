package topic4.assignment1;

/**
 * Created by e083028 on 9/3/2018.
 */
public class PrintNumberThread extends Thread {

    private int number;

    public PrintNumberThread(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Number: " + number);
    }
}
