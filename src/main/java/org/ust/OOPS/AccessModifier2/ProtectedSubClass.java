package org.ust.OOPS.AccessModifier2;

import org.ust.OOPS.AccessModifier.ProtectedExample;

public class ProtectedSubClass extends ProtectedExample {

    public ProtectedSubClass(int protectedNumber) {
        super(protectedNumber);
    }

    public void display(){
        System.out.println(" The protected number is "+protectedNumber);

        //Private members not allowed in subclass
        //protectedNumber.privateNumber=100;
    }
}
