package main.java.designpattern.observer;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {

        BigDecimal minTemp = BigDecimal.valueOf(23);
        BigDecimal maxTemp = BigDecimal.valueOf(28);

        Termometer termometer = new Termometer(maxTemp,minTemp);

        parent parent1 = new parent("mother");
        parent parent2= new parent("father");

        termometer.add(parent1);
        termometer.add(parent2);

        for (int i = termometer.getInstantTemperature().intValue(); i<=30; i++){

          termometer.setInstantTemperature(BigDecimal.valueOf(i));

        }

        for (int i = termometer.getInstantTemperature().intValue(); i>=22; i--){

            termometer.setInstantTemperature(BigDecimal.valueOf(i));
        }

    }
}
