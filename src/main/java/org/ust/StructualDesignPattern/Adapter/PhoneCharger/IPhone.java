package org.ust.StructualDesignPattern.Adapter.PhoneCharger;

public class IPhone implements LightningPhone{

    @Override
    public void chargeWithLightning() {
        System.out.println("Charging iPhone with Lightning charger");
    }
}
