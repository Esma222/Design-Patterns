package main.java.designpatterns2.structuaral.adapter;

public class PhoneElectricalHomeHomeDeviceAdapter implements ElectricalHomeDevice {

    private  Phone phone;

    public PhoneElectricalHomeHomeDeviceAdapter(Phone phone) {
        this.phone = phone;
    }

    @Override
    public int plugAndPlay() {
        return phone.charge();
    }
}
