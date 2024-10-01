package org.ust.CreationDesignPattern.AbstractFactory;

public class MacOsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOsCheckBox();
    }
}
