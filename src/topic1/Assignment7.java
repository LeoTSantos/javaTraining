package topic1;

import java.util.Scanner;

/**
 * Created by e083028 on 8/24/2018.
 */
public class Assignment7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        double fact;

        System.out.print("Enter number: ");
        number = Integer.parseInt(scanner.next());

        fact = factorial(number);

        System.out.println("The factorial is " + fact);
    }

    static double factorial(int n)
    {
        return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
    }
}
