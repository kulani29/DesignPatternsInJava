package CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements Employee {

    List<Employee> employeeList = new ArrayList<>();

    @Override
    public void showEmployeeDetails() {
        System.out.println("========Showing list of all employees with details======");

        for (Employee emp : employeeList) {
            emp.showEmployeeDetails();
        }
    }

    public void addEmployee(Employee emp) {
        employeeList.add(emp);
        System.out.println("New Employee added successfully..!");
    }

    public void removeEmployee(Employee emp) {
        employeeList.remove(emp);
        System.out.println("Employee removed successfully..!");
    }

}
