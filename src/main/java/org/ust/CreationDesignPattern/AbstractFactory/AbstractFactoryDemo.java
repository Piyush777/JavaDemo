package org.ust.CreationDesignPattern.AbstractFactory;

public class AbstractFactoryDemo {

    private static GUIFactory configureFactory(String os){
        if(os.equalsIgnoreCase("mac")){
            return new MacOsFactory();
        }else{
            return new WindowsFactory();
        }
    }

    public static void main(String[] args) {
        GUIFactory windowFactory = configureFactory("windows");
        Button windowFactoryButton = windowFactory.createButton();
        CheckBox windowFactoryCheckBox = windowFactory.createCheckBox();
        windowFactoryCheckBox.paint();
        windowFactoryButton.paint();

        GUIFactory macOsFactory = configureFactory("mac");
        Button macosFactoryButton = macOsFactory.createButton();
        CheckBox macOsCheckBox = macOsFactory.createCheckBox();
        macosFactoryButton.paint();
        macOsCheckBox.paint();
    }
}
