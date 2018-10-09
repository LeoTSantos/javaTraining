package topic1;

import java.util.Scanner;

/**
 * Created by e083028 on 8/24/2018.
 */
public class Assignment3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double min;
        double days;
        int years;

        System.out.print("Minutes: ");
        min = Double.parseDouble(scanner.next());

        days = (min/60)/24;
        years = (int) days/365;
        days = days%365;

        System.out.println(min + " minutes -> " + years + " years and " + days + " days.");
    }
}
