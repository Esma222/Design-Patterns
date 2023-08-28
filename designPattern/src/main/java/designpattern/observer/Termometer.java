package main.java.designpattern.observer;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Termometer  extends Observable {

    private BigDecimal instantTemperature;
    private BigDecimal maxTemperature;
    private BigDecimal minTemperature;

    public Termometer(BigDecimal maxTemperature, BigDecimal minTemperature) {
        this.maxTemperature = maxTemperature;
        this.minTemperature = minTemperature;
        this.instantTemperature= BigDecimal.valueOf(24);
    }

    public BigDecimal getInstantTemperature() {
        return instantTemperature;
    }

    public void setInstantTemperature(BigDecimal instantTemperature) {
        this.instantTemperature = instantTemperature;
        System.out.println(instantTemperature);
        controlTemprature();
    }

    private void controlTemprature() {
        if(instantTemperature.compareTo(minTemperature)<0  || maxTemperature.compareTo(instantTemperature)<0){
            notifyTo();
        }
        else System.out.println("");

    }
}
