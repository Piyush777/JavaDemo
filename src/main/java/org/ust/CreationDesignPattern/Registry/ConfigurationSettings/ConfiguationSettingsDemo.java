package org.ust.CreationDesignPattern.Registry.ConfigurationSettings;

public class ConfiguationSettingsDemo {

    public static void main(String[] args) {
        ConfigurationRegistry configurationRegistry = ConfigurationRegistry.getInstance();

        //setting config values
        configurationRegistry.setSettings("appName", "RegistryApp");
        configurationRegistry.setSettings("version","1.0.0.");

        System.out.println("App Name: "+ configurationRegistry.getSetting("appName"));
        System.out.println("Version: "+ configurationRegistry.getSetting("version"));
    }
}
