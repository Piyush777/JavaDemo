package org.ust.OOPS.Encapsulation;

public class Employee {
    private String name;
    private int id;
    private double salary;
    private int phoneNo[];

    //memory reference to array: 0x123
    public Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public int[] getPhoneNo(){
        return this.phoneNo.clone();
    }
    //getter not needed or can be made private as the program has a separate display method
    /*private String getName(){
        return name;
    }*/

    public void setName(String name){
        this.name = name;
    }

    /*private double getSalary(){
        return salary;
    }*/

    public void setSalary(double salary){
        if(salary>=0){
            this.salary=salary;
            System.out.println("Salary update to "+ this.salary);
        }else{
            System.out.println("Salary cannot be negative");
        }
    }

    public void displayEmployeeInfo(){

        System.out.println("Employee Name "+ name);
        System.out.println("  Employee ID "+ id);
        System.out.println(" Employee Salary "+ salary);
    }
}

class DriverEmployee{

    public static void main(String[] args) {

        Employee employee = new Employee("John Doe ", 101, 50000);

        employee.displayEmployeeInfo();

        //valid case
        employee.setSalary(55000);

        employee.setSalary(-100);

        employee.displayEmployeeInfo();
    }
}
