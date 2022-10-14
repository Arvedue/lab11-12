package com.company.modules;

import com.company.abstractions.SkyVehicle;
import com.company.abstractions.VehicleMovement;

public class Airplane extends Vehicle implements SkyVehicle, VehicleMovement {
    public Airplane(String model, int year) {
        super(model, year);
    }

    @Override
    public void fly() {
        displayData();
        System.out.println(getClass().getSimpleName() + " flies...\n");
    }

    @Override
    public void move() {
        fly();
    }

    private void displayData(){
        System.out.println("Airplane model: " + getModel());
        System.out.println("Airplane year: " + getYear());
    }
}
