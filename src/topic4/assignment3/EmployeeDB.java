package topic4.assignment3;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by e083028 on 9/3/2018.
 */
public class EmployeeDB {

    private ArrayList<Employee> employeeList = new ArrayList<>();

    public boolean addEmployee(Employee e) {
        try{
            employeeList.add(e);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public boolean deleteEmployee(int eCode) {
        try {
            employeeList.remove(eCode);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public String showPaySlip(int eCode) {
        Employee e = employeeList.get(eCode);
        return e.getPaySlip();
    }

    public Employee[] listAll() {
        int size = employeeList.size();

        Employee[] empArray = new Employee[size];
        int i = 0;

        for (Employee e: employeeList) {
            empArray[i] = e;
            i++;
        }

        return empArray;
    }
}
