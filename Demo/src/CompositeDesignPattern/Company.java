package CompositeDesignPattern;

public class Company {

    public static void main(String[] args) {

        CompanyDirectory directory = new CompanyDirectory();

        Develeoper d1 = new Develeoper(301, "Ajit", "Jog", "Developer");
        Develeoper d2 = new Develeoper(302, "Neha", "Wagh", "Developer");

        Manager m1 = new Manager(1101, "Santosh", "Deshmukh", "Project Manager");
        Manager m2 = new Manager(1102, "Vikas", "Pande", "Senier Manager");

        directory.addEmployee(d1);
        directory.addEmployee(d2);
        directory.addEmployee(m1);
        directory.addEmployee(m2);

        directory.showEmployeeDetails();

        directory.addEmployee(new Develeoper(205,"Aniket","Kulkarni","Jr. Developer"));

        directory.showEmployeeDetails();

    }
}
