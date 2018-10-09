package topic4.assignment6;

/**
 * Created by e083028 on 9/3/2018.
 */
public class Assignment6 {
    public static void main(String[] args) {
        FinalizeExample example = new FinalizeExample();
        example = new FinalizeExample();
        example = new FinalizeExample();
        example = new FinalizeExample();
        example = new FinalizeExample();

        Runtime.getRuntime().gc();
    }
}
