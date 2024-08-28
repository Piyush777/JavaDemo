package org.ust.OOPS.AccessModifier2;

import org.ust.OOPS.AccessModifier.PrivateExample;

public class TestPrivate {

    public static void main(String[] args) {

        PrivateExample privateExample = new PrivateExample(10);

        //show method accessible due to public modifier
        privateExample.show();

        //Display not accessible due to private modifier
        //privateExample.display();
    }
}
