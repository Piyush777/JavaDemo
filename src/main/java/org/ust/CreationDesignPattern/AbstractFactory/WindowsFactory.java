package org.ust.CreationDesignPattern.AbstractFactory;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckbox();
    }
}
