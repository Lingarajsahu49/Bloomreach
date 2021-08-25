package org.example.question2.cars;

import org.example.question2.cars.parent.Car;

public class ToyotaYaris extends Car {

    @Override
    public String getModel() {
        return "Yaris";
    }

    @Override
    public String getMake() {
        return "Toyota";
    }
}
