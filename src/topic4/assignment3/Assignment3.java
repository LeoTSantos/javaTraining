package topic4.assignment3;

/**
 * Created by e083028 on 9/3/2018.
 */
public class Assignment3 {
    public static void main(String[] args) {

        EmployeeDB db = new EmployeeDB();

        db.addEmployee(new Employee("Employee1", "Project Manager", "C1", 15000.00));
        db.addEmployee(new Employee("Employee2", "Business Analyst", "B2", 11000.00));
        db.addEmployee(new Employee("Employee3", "Scrum Master", "B2", 10000.00));
        db.addEmployee(new Employee("Employee4", "Developer L2", "B1", 6000.00));
        db.addEmployee(new Employee("Employee5", "Developer L1", "B1", 5000.00));
        db.addEmployee(new Employee("Employee6", "Tester", "B1", 5000.00));

        Employee[] empList = db.listAll();

        for (Employee e: empList) {
            System.out.println(e.print());
        }

        System.out.println(db.showPaySlip(1));
        System.out.println(db.showPaySlip(3));

        db.deleteEmployee(1);
        db.deleteEmployee(3);

        empList = db.listAll();

        for (Employee e: empList) {
            System.out.println(e.print());
        }

        System.out.println(db.showPaySlip(1));
        System.out.println(db.showPaySlip(3));

    }
}
