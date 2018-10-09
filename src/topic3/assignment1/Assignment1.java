package topic3.assignment1;

/**
 * Created by e083028 on 8/29/2018.
 */
public class Assignment1 {
    public static void main(String[] args) {
        String name = args[0];
        int age = Integer.parseInt(args[1]);

        try {
            checkAge(age);
            System.out.print("Name: " + name + "\nAge: " + age);
        } catch (InputOutOfRangeException e) {
            System.out.print(e);
        }

    }

    private static void checkAge(int age) throws InputOutOfRangeException {
        if (age <= 18 || age > 60)
            throw new InputOutOfRangeException();
    }
}
