package org.ust.CreationDesignPattern.Prototype.DeepCopy;

import java.util.ArrayList;
import java.util.List;

public class DeepCopyDemo {

    public static void main(String[] args) {
        List<String> hobbies = new ArrayList<>();
        hobbies.add("Reading");

        Person originalPerson  = new Person("John", hobbies);
        Person clonedPerson = originalPerson.clone();


        System.out.println("Original Person "+ originalPerson);
        System.out.println("Cloned Person "+ clonedPerson);

        //After modification
        System.out.println("After modification ");
        clonedPerson.addHobby("Swimming");
        System.out.println("Original Person "+ originalPerson);
        System.out.println("Cloned Person "+ clonedPerson);

    }
}
