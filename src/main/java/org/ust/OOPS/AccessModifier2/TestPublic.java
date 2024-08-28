package org.ust.OOPS.AccessModifier2;

import org.ust.OOPS.AccessModifier.PublicExample;

public class TestPublic {

    public static void main(String[] args) {
        PublicExample publicExample = new PublicExample();
        publicExample.display();

        System.out.println("public variable: "+publicExample.publicVariable);
    }
}
