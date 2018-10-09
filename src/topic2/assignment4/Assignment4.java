package topic2.assignment4;

/**
 * Created by e083028 on 8/28/2018.
 */
public class Assignment4 {
    public static void main(String[] args) {
        CashPayment cash1 = new CashPayment(150.00);
        CashPayment cash2 = new CashPayment(350.00);
        CreditCardPayment cred1 = new CreditCardPayment(888.88,"THE MAN ON THE CARD", "12/12/2022", "5654 5654 2585 3696 1474");
        CreditCardPayment cred2 = new CreditCardPayment(154.25,"THE OTHER MAN ON THE CARD", "15/05/2020", "7896 5412 3574 1258 9548");

        cash1.paymentDetails();
        cash2.paymentDetails();
        cred1.paymentDetails();
        cred2.paymentDetails();
    }
}
