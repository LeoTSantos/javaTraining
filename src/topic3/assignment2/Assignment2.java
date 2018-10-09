package topic3.assignment2;

/**
 * Created by e083028 on 8/30/2018.
 */
public class Assignment2 {
    public static void main(String[] args) {

        try {
            int mark1StudentA = Integer.parseInt(args[0]);
            int mark2StudentA = Integer.parseInt(args[1]);
            int mark3StudentA = Integer.parseInt(args[2]);
            int mark1StudentB = Integer.parseInt(args[3]);
            int mark2StudentB = Integer.parseInt(args[4]);
            int mark3StudentB = Integer.parseInt(args[5]);

            int avgA = (mark1StudentA + mark2StudentA + mark3StudentA)/3;
            int avgB = (mark1StudentB + mark2StudentB + mark3StudentB)/3;

            System.out.println("Student A average: " + avgA);
            System.out.println("Student B average: " + avgB);
        } catch(NumberFormatException e){
            System.out.print("The mark entered is not an integer!");
        }

    }
}
