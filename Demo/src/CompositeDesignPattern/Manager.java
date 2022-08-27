package CompositeDesignPattern;

public class Manager implements Employee {

    private int employeeId;
    private String firstName;
    private String lastName;
    private String designation;

    public Manager(int employeeId, String firstName, String lastName, String designation) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.designation = designation;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("=======Manager Profile======");
        System.out.println("Emp Id:" + employeeId + " with Employee Name:" + firstName + " " + lastName + " has a designation of " + designation);
    }
}
