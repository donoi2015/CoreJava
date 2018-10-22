package ocjp.ch1;

/**
 * @author ts-tuluv.battulga
 */
public class Employee {
    public int employeeId;
    public String firstName, lastName;
    public int yearStarted;

    public static void main(String[] args) {
        Employee one = new Employee();
        one.employeeId = 101;
        Employee two = new Employee();
        two.employeeId = 101;
        if (one.equals(two))
            System.out.println("Success");
        else
            System.out.println("Failure");
    }

    @Override public int hashCode() {
        return employeeId;
    }

    @Override public boolean equals(Object e) {
        if (e == null)
            return false;
        if (e == this)
            return true;

        if (!(e instanceof Employee)) { return false;}
        Employee employee = (Employee) e;
        return this.employeeId == employee.employeeId;
    }
}