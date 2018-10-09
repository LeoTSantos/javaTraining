package topic4.assignment6;

/**
 * Created by e083028 on 9/3/2018.
 */
public class FinalizeExample {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called.");
        super.finalize();
    }
}
