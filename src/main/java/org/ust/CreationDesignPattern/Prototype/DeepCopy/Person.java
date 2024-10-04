package org.ust.CreationDesignPattern.Prototype.DeepCopy;

import java.util.ArrayList;
import java.util.List;

public class Person implements Cloneable{
    private String name;
    private List<String> hobbies;

    public Person(String name, List<String> hobbies){
        this.name=name;
        this.hobbies=hobbies;
    }


    @Override
    public Person clone() {
        List<String> clonedHobbies = new ArrayList<>(this.hobbies);
        return new Person(this.name,clonedHobbies);
    }

    public void addHobby(String hobby){
        this.hobbies.add(hobby);
    }

    public List<String> getHobbies(){
        return hobbies;

    }


    @Override
    public String toString(){
        return "Person(name="+ name + " , hobbies= "+ hobbies+"}";
    }
}
