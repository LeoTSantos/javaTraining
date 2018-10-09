package topic4.assignment4;

/**
 * Created by e083028 on 9/3/2018.
 */
public class Assignment4 {
    public static void main(String[] args) {
        TelephoneBook telephoneBook = new TelephoneBook();

        telephoneBook.add("Ace", "99000-0001");
        telephoneBook.add("Deuce", "99000-0002");
        telephoneBook.add("Trey", "99000-0003");
        telephoneBook.add("Catre", "99000-0004");
        telephoneBook.add("Cinque", "99000-0005");
        telephoneBook.add("Sice", "99000-0006");
        telephoneBook.add("Seven", "99000-0007");
        telephoneBook.add("Eight", "99000-0008");
        telephoneBook.add("Nine", "99000-0009");
        telephoneBook.add("Dyce", "99000-0010");
        telephoneBook.add("Jack", "99000-0011");
        telephoneBook.add("Queen", "99000-0012");
        telephoneBook.add("King", "99000-0013");

        System.out.println("Catre's phone number: " + telephoneBook.getPhone("Catre"));
        System.out.println("Ace's phone number: " + telephoneBook.getPhone("Ace"));
        System.out.println("King's phone number: " + telephoneBook.getPhone("King"));
    }
}
