package main.java.designpattern.abstractfactory;

public class Note8Factory implements TelephoneFactory{
    @Override
    public Telephone getTelephone(String model, String battery, int width, int height) {
        return new Note8(model,battery,width,height);
    }
}
