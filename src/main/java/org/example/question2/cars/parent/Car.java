package org.example.question2.cars.parent;

public abstract class Car {
    String make;
    String model;

    public abstract String getModel();
    public abstract String getMake();

    public Car(){
        this.make = getMake();
        this.model = getModel();
    }

}
