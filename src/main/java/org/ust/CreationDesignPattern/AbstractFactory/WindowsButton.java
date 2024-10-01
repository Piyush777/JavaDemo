package org.ust.CreationDesignPattern.AbstractFactory;

public class WindowsButton implements Button{
    @Override
    public void paint() {
        System.out.println("Rendering a button in Windows style");
    }
}
