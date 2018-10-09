package topic2.assignment2;

/**
 * Created by e083028 on 8/27/2018.
 */
public class Email extends Document{
    private String sender;
    private String recipient;
    private String title;

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "From: " + sender + "\n" +
               "To: " + recipient + "\n" +
               "Title: " + title + "\n" + text;
    }

}
