package org.ust.OOPS.AccessModifier;

import org.ust.OOPS.AccessModifier2.ProtectedSubClass;

public class TestProtectedSamePackage {

    public static void main(String[] args) {
        ProtectedExample protectedExample = new ProtectedExample(100);
        System.out.println("Initial Protected Number "+protectedExample.protectedNumber);
        protectedExample.protectedNumber=300;
        System.out.println("Updated Protected Number "+protectedExample.protectedNumber);
    }
}
