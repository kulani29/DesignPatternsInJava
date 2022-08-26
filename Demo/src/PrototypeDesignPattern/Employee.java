package PrototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {

    private List<String> empList;

    public List<String> getEmpList() {
        return empList;
    }

    public Employee() {
        empList = new ArrayList<String>();
    }

    public Employee(List<String> list) {
        this.empList = list;
    }

    public List<String> loadData() {
        empList.add("Raju");
        empList.add("Mahesh");
        empList.add("Kiran");
        return empList;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<String>();
        for (String s : this.getEmpList()) {
            temp.add(s);
        }
        return new Employee(temp);
    }


}
