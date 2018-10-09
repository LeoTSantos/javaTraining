package topic2.assignment4;

/**
 * Created by e083028 on 8/28/2018.
 */
public class Payment {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Payment(double amount) {
        this.amount = amount;
    }

    public void paymentDetails() {
        System.out.println("The amount is " + amount);
    }
}
