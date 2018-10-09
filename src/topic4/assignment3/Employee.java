package topic4.assignment3;

/**
 * Created by e083028 on 9/3/2018.
 */
public class Employee {

    private String name;
    private String position;
    private String band;
    private double salary;

    public Employee(String name, String position, String band, double salary) {
        this.name = name;
        this.position = position;
        this.band = band;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String print() {
        return "Name: " + name + "\n" +
                "Position: " + position + "\n" +
                "Band: " + band + "\n" +
                "Salary: " + salary + "\n";
    }

    public String getPaySlip() {
        return "Name: " + name + "\n" + "Salary: " + salary + "\n";
    }
}
