package org.ust.StructualDesignPattern.Adapter.PhoneCharger;

public class PhoneChargerDemo {
    public static void main(String[] args) {
        //Charge Android phone with USB charger
        USBCharger androidPhone = new AndroidPhone();
        androidPhone.chargeWithUSB();

        //Charge iPhone with USB charger using adapter
        LightningPhone iPhone = new IPhone();
        USBCharger iPhoneAdapter = new LightningtoUSBAdapter(iPhone);
        iPhoneAdapter.chargeWithUSB();
    }
}
