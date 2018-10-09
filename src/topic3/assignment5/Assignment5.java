package topic3.assignment5;

/**
 * Created by e083028 on 8/30/2018.
 */
public class Assignment5 {
    public static void main(String[] args) {
        String str = args[0];
        char c = args[1].charAt(0);

        String regex = "((?!" + c + ").)";

        str = str.replaceAll(regex, "");

        int number = str.length();

        System.out.print(number);
    }
}
