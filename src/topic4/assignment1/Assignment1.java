package topic4.assignment1;


/**
 * Created by e083028 on 9/3/2018.
 */
public class Assignment1 {
    public static void main(String[] args) {

        PrintNumberThread prntNumber;
        FactorialThread factorial;

        for(int i = 0; i < 5; i++) {
            int number = (int) (Math.random()*20);

            prntNumber = new PrintNumberThread(number);
            factorial = new FactorialThread(number);

            prntNumber.start();
            factorial.start();

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
