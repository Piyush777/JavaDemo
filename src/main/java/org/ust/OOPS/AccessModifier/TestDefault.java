package org.ust.OOPS.AccessModifier;

public class TestDefault {

    public static void main(String[] args) {
        DefaultExample defaultExample = new DefaultExample(25);

        defaultExample.display();
        defaultExample.defaultNumber = 75;
        defaultExample.display();
    }
}
