package org.ust.OOPS.AccessModifier;

public class PrivateExample {

    private int privateNumber;


    public PrivateExample(int privateNumber){
        this.privateNumber = privateNumber;
    }

    //private method
    private void display(){
        System.out.println("The Private Number is "+ privateNumber);
    }

    //public method to access private method
    public void show(){

        //Access private method from the same class
        display();
    }
}

class TestPrivateSameFile{

    public static void main(String[] args) {
        PrivateExample privateExample = new PrivateExample(30);

        //show method accessible due to public modifier
        privateExample.show();

        //Display not accessible due to private modifier
        //privateExample.display();
    }
}
