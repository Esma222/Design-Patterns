package main.java.designpattern.abstractfactory;

public interface TelephoneFactory {

    Telephone getTelephone(String model, String battery, int width, int height);

}
