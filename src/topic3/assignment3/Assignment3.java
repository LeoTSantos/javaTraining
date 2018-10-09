package topic3.assignment3;

/**
 * Created by e083028 on 8/30/2018.
 */
public class Assignment3 {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = Integer.parseInt(args[2]);
            int d = Integer.parseInt(args[3]);
            int e = Integer.parseInt(args[4]);

            int avg = (a + b + c + d + e)/5;

            System.out.print("Average: " + avg);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("Enter 5 values!");
        }
    }
}
