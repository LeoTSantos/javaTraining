package topic2.assignment2;

/**
 * Created by e083028 on 8/27/2018.
 */
public class Assignment2 {
    public static void main(String[] args) {
        Email email = new Email();

        email.setSender("sender@mail.com");
        email.setRecipient("recipient@mail.com");
        email.setTitle("The Email");

        email.write("Dear Receiver,\nThis is an email. It is a really important message. Please respond asap. \nThanks,\nSender");

        email.read();
    }
}
