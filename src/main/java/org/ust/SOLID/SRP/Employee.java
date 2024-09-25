package org.ust.SOLID.SRP;



/*

Following code violates SRP, original code
public class Employee{
    private String name;
    private String email;

    public void saveEmployee(){
        //save employee to database
    }

    public void sendEmail(String message){
        //send email
    }

    public void calculateSalary(){
        //calculate salary
    }
}
*/

//Refractored Code which follows SRP
public class Employee {
    private String name;
    private String email;

    //Getter and setters
}

class EmployeeRepository{
    public void saveEmployee(Employee employee){
       // code to save employee to database
    }
}

class EmailService{
    public void sendEmail(String message, String email){
        //send email
    }
}

class SalaryCalculator{
    public double calculateSalary(Employee employee){
        return 0;
    }
}



