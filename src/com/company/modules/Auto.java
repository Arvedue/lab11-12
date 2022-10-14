package com.company.modules;

import com.company.abstractions.GroundVehicle;
import com.company.abstractions.VehicleMovement;

public class Auto extends Vehicle implements GroundVehicle, VehicleMovement {
    public Auto(String model, int year) {
        super(model, year);
    }

    @Override
    public void drive() {
        displayData();
        System.out.println(getClass().getSimpleName() + " drives...\n");
    }

    @Override
    public void move() {
        drive();
    }

    private void displayData(){
        System.out.println("Auto model: " + getModel());
        System.out.println("Auto year: " + getYear());
    }
}
