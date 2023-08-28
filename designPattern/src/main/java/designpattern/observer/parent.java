package main.java.designpattern.observer;

public class parent implements  Observer{

    private  String name;

    public parent(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable observable) {

        Termometer termometer = (Termometer) observable;
        System.out.println(name +" says that temprature is "+ termometer.getInstantTemperature());
    }
}
