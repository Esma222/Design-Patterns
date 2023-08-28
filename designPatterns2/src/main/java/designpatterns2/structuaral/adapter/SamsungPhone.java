package main.java.designpatterns2.structuaral.adapter;

public class SamsungPhone implements Phone{

    private int volt;

    public SamsungPhone() {
        this.volt=5;
    }

    @Override
    public int charge() {

        System.out.println("Samsung phone charging");
        return volt;
    }
}
