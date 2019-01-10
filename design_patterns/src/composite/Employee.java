package composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String department;
    private int salary;
    private List<Employee> subordinates = new ArrayList<Employee>();

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return("Employee [ " + "name: " + name + ", department: " + department + ", salary: " + salary + " ]");
    }
}
