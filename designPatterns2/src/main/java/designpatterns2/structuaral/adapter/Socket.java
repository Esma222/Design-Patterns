package main.java.designpatterns2.structuaral.adapter;

public class Socket {

    public void  electrify(ElectricalHomeDevice electricalHomeDevice){
        int volt = electricalHomeDevice.plugAndPlay();
        System.out.println("Volt is "+ volt);
    }

}
