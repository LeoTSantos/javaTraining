package topic1;

/**
 * Created by e083028 on 8/24/2018.
 */
public class Assignment2 {

    public static void main(String[] args) {
        int a1 = -5;
        int a2 = 8;
        int a3 = 6;

        int b1 = 55;
        int b2 = 9;
        int b3 = 9;

        float c1 = 20;
        float c2 = -3;
        float c3 = 5;
        float c4 = 8;

        float d1 = 5;
        float d2 = 15;
        float d3 = 3;
        float d4 = 2;
        float d5 = 8;
        float d6 = 3;

        System.out.print("a -> " + a1 + "+" + a2 + "*" + a3 + " = " );
        System.out.print(a1+a2*a3);
        System.out.print("\n");

        System.out.print("b -> (" + b1 + "+" + b2 + ")%" + b3 + " = " );
        System.out.print((b1+b2)%b3);
        System.out.print("\n");

        System.out.print("c -> " + c1 + "+" + c2 + "*" + c3 + "/"+ c4 +" = " );
        System.out.print(c1+c2*c3/c4);
        System.out.print("\n");

        System.out.print("d -> " + d1 + "+" + d2 + "/" + d3 + "*" + d4 + "-" + d5 + "%" + d6 + " = " );
        System.out.print(d1+d2/d3*d4-d5%d6);
        System.out.print("\n");
    }
}
