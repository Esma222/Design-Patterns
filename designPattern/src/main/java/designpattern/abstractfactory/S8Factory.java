package main.java.designpattern.abstractfactory;

public class S8Factory implements TelephoneFactory{
    @Override
    public Telephone getTelephone(String model, String battery, int width, int height) {
        return new S8(model,battery,width,height);
    }
}
