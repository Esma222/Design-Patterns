package main.java.designpatterns2.structuaral.adapter;

public class Iron implements ElectricalHomeDevice {

    private int volt;

    public Iron() {
        this.volt=220;
    }

    @Override
    public int plugAndPlay() {

        System.out.println(" someone is ironing ");

        return volt;
    }
}
