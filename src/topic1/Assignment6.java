package topic1;

import java.util.Scanner;

/**
 * Created by e083028 on 8/24/2018.
 */
public class Assignment6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size;
        int max = 0;
        int[] array;

        System.out.print("array size: ");
        size = Integer.parseInt(scanner.next());
        array = new int[size];

        System.out.print("enter elements: ");
        for(int i = 0; i < size; i++){
            array[i] = Integer.parseInt(scanner.next());
        }

        for(int i = 0; i < size; i++){
            if(max < array[i]){
                max = array[i];
            }
        }

        System.out.println("The maximum value is " + max);
    }
}
