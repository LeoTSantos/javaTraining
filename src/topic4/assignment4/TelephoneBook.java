package topic4.assignment4;

import java.util.HashMap;

/**
 * Created by e083028 on 9/3/2018.
 */
public class TelephoneBook {
    private HashMap<String, String> telephones = new HashMap<>();

    public boolean add(String name, String number) {
        try {
            telephones.put(name, number);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String getPhone(String name) {
        return telephones.get(name);
    }
}
