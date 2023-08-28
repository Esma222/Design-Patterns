package main.java.designpatterns2.structuaral.adapter;

public class Refrigerator implements ElectricalHomeDevice {
    private int volt;

    public Refrigerator() {
        this.volt=220;
    }

    @Override
    public int plugAndPlay() {

        System.out.println(" the refrigerator is working ");

        return volt;
    }
}
