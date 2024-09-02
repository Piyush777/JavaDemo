package org.ust.Association;
import java.util.*;


class Employee{
    private final String name;

    public Employee(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}

class Department{
    private final String departmentName;
    private final List<Employee> employeeList;

    public Department(String departmentName){
        this.departmentName = departmentName;
        this.employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public List<Employee> getEmployeeList(){
        return employeeList;
    }

    public String getDepartmentName(){
        return departmentName;
    }
}


public class OneToManyAssociation {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        employees[0] = new Employee("Alice");
        employees[1] = new Employee("Bob");

        Department department = new Department("Engineering");

        for(Employee employee: employees){
            department.addEmployee(employee);
        }

        System.out.println("Department "+ department.getDepartmentName());

        for(Employee employee: department.getEmployeeList()){
            System.out.println("Employee :"+ employee.getName());
        }
    }
}
