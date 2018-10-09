package topic4.assignment5;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by e083028 on 9/3/2018.
 */
public class EmployeeSet {
    private HashSet<String> employees = new HashSet<>();

    public boolean add(String name) {
        try {
            employees.add(name);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void print() {
        System.out.println("EMPLOYEE LIST:");

        Iterator<String> it = employees.iterator();

        while (it.hasNext()) {
            System.out.println("- " + it.next());
        }
    }

}
