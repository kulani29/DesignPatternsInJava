package PrototypeDesignPattern;

public class ProtoTypePatternTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e = new Employee();
        e.loadData();

        System.out.println("====E3===");
        Employee e2= (Employee) e.clone();
        e2.getEmpList().stream().forEach(r->System.out.println(r));


        System.out.println("====E3===");
        Employee e3= (Employee) e.clone();

        e3.getEmpList().add("Akshay");
        e3.getEmpList().stream().forEach(p->System.out.println(p));

        System.out.println("====E4===");
        Employee e4= (Employee) e.clone();

        e4.getEmpList().remove("Raju");
        e4.getEmpList().stream().forEach(p->System.out.println(p));

    }
}
