package org.example.question2.cars;

import org.example.question2.cars.parent.Car;

public class VolkswagenPolo extends Car {
    @Override
    public String getModel() {
        return "Polo";
    }

    @Override
    public String getMake() {
        return "Volkswagen";
    }
}
