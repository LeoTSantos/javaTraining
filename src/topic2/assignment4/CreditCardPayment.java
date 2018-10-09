package topic2.assignment4;

/**
 * Created by e083028 on 8/28/2018.
 */
public class CreditCardPayment extends Payment{
    private String nameOnCard;
    private String expirationDate;
    private String creditCardNumber;

    public CreditCardPayment(double amount, String nameOnCard, String expirationDate, String creditCardNumber) {
        super(amount);
        this.nameOnCard = nameOnCard;
        this.expirationDate = expirationDate;
        this.creditCardNumber = creditCardNumber;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public void paymentDetails() {
        System.out.println("Name on the Card: " + nameOnCard + "\n" +
                "Expiration Date: " + expirationDate + "\n" +
                "Credit Card Number: " + creditCardNumber + "\n" +
                "Amount: " + super.getAmount() + "\n");
    }
}
