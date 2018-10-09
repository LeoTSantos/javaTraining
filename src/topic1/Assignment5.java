package topic1;

import java.util.Scanner;

/**
 * Created by e083028 on 8/24/2018.
 */
public class Assignment5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        int sum;

        System.out.print("Enter 4 digit number: ");
        number = Integer.parseInt(scanner.next());

        int mil = (int) number/1000;

        number = number%1000;
        int hund = (int) number/100;

        number = number%100;
        int dec = (int) number/10;

        number = number%10;

        sum = mil + hund + dec + number;

        System.out.println("The sum of all the digit entered is " + sum);
    }
}
