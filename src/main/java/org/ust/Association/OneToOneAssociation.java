package org.ust.Association;


class Passport{

    private final String passportNumber;

    public Passport(String passportNumber){
        this.passportNumber=passportNumber;
    }

    public String getPassportNumber(){
        return passportNumber;
    }
}

class Person{

    private final String name;
    private final Passport passport;

    public Person(String name, Passport passport){
        this.name = name;
        this.passport = passport;
    }

    public String getName(){
        return name;
    }

    public Passport getPassport(){
        return passport;
    }

    public void displayInfo(){
        System.out.println("Person Name: "+ name+ " and Passport: "+ passport.getPassportNumber());
    }
}


public class OneToOneAssociation {

    public static void main(String[] args) {
        Passport passport = new Passport("ABCD1234");
        Person person = new Person("John Wick",passport);
        person.displayInfo();

    }
}
