package org.ust.CreationDesignPattern.AbstractFactory;

public class MacOsCheckBox implements CheckBox{

    @Override
    public void paint() {
        System.out.println("Rendering checkbox in MacOS Style");
    }
}
