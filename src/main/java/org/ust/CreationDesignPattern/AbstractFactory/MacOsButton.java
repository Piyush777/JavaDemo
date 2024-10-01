package org.ust.CreationDesignPattern.AbstractFactory;

public class MacOsButton implements Button{

    @Override
    public void paint() {
        System.out.println("Rendering a button in MacOS Style");
    }
}
