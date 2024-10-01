package org.ust.CreationDesignPattern.AbstractFactory;

public class WindowsCheckbox implements CheckBox{

    @Override
    public void paint() {
        System.out.println("Rendering a checkbox in Windows Style");
    }
}
