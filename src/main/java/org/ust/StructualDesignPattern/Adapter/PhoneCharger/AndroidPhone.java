package org.ust.StructualDesignPattern.Adapter.PhoneCharger;

public class AndroidPhone implements USBCharger{
    @Override
    public void chargeWithUSB() {
        System.out.println("Charging Android phone with USB-C charger");
    }
}
