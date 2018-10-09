package topic4.assignment1;

/**
 * Created by e083028 on 9/3/2018.
 */
public class FactorialThread extends Thread {

    private int number;

    public FactorialThread(int number) {
        this.number = number;
    }

    public void run() {
        double fact = factorial(number);
        System.out.println("Factorial of " + number + ": " + fact);
    }

    double factorial(int n)
    {
        return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
    }
}
