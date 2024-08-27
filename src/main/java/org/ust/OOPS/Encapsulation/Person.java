package org.ust.OOPS.Encapsulation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 18) { //validate age before modificaiton
            this.age = age;
        } else {
            System.out.println(" Age should be >18");
        }
    }
}

  class Main {
      public static void main(String[] args) {
          Person person = new Person("Alice", 30);
          System.out.println("Name " + person.getName());
          System.out.println("Age "+ person.getAge());

          person.setName("Bob");
          //setting invalid age
          person.setAge(-1);
          //setting valid age
          person.setAge(35);

          System.out.println("Updated Person ");
          System.out.println(person.getName()+" "+person.getAge());
      }
  }
