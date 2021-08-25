package org.example.question2.cars;


import org.example.question2.cars.parent.Car;

public class FiatPanda extends Car {
    @Override
    public String getModel() {
        return "Panda";
    }

    @Override
    public String getMake() {
        return "Fiat";
    }
}

