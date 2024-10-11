package org.ust.StructualDesignPattern.Adapter.PhoneCharger;

public class LightningtoUSBAdapter implements USBCharger{

    private LightningPhone lightningPhone;
    public LightningtoUSBAdapter(LightningPhone lightningPhone){
        this.lightningPhone = lightningPhone;
    }

    @Override
    public void chargeWithUSB() {
        System.out.println("USB Charger Interfacing to Lightening Port");
        lightningPhone.chargeWithLightning();
    }
}
