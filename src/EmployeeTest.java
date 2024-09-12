public class EmployeeTest {
    public static void main(String[] args) {
        // we create an employee object first
        Employee emp = new Employee("Gregorics Tibor", 100000.0f);

        // print initial details of the employee
        System.out.println("Initial employee details:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary() + " Ft");

        // raise salary by 15% note: we have to put an 'f' after the number, because it defaults to double for some
        // reason
        emp.raiseSalary(0.15f);

        System.out.println("Employee details after 15% raise:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary() + " Ft");

    }
}

class Employee {
    private String name;
    private float salary;

    // you can generate teh constructor and the getters with intelliJ
    public Employee(String n, float s) {
        name = n;
        salary = s;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public void raiseSalary(float percent) {
        salary = salary + (salary * percent);
    }
}