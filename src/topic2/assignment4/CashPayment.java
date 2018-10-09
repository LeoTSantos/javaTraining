package topic2.assignment4;

/**
 * Created by e083028 on 8/28/2018.
 */
public class CashPayment extends Payment {

    public CashPayment(double amount) {
        super(amount);
    }

    @Override
    public void paymentDetails() {
        System.out.println("The amount in cash is " + super.getAmount());
    }
}
