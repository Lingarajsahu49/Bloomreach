package org.example.question2;

import org.example.question2.cars.FiatPanda;
import org.example.question2.cars.ToyotaYaris;
import org.example.question2.cars.VolkswagenPolo;
import org.example.question2.cars.parent.Car;

public class CarCreator {
    public static void main(String args[]) {
        CarEnum carEnum = CarEnum.GERMAN;

        Car newCar = null;
        switch (carEnum){
            case ITALIAN:
                newCar = new FiatPanda();
                break;
            case GERMAN:
                newCar = new VolkswagenPolo();
                break;
            case JAPANESE:
                newCar = new ToyotaYaris();
                break;
        }
        System.out.println("Car Info : "+newCar.getMake()+", "+newCar.getModel());
    }

    public enum CarEnum{
        ITALIAN,GERMAN,JAPANESE
    }
}
