package topic4.assignment2;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by e083028 on 9/3/2018.
 */
public class PrintTimeThread extends Thread {

    private SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    private Calendar cal;

    private boolean running = true;

    public void run() {
        while (running) {
            cal = Calendar.getInstance();
            System.out.println(sdf.format(cal.getTime()));

            try {
                this.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stopThread() {
        running = false;
    }

}
