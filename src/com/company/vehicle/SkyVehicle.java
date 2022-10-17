package com.company.vehicle;

public class SkyVehicle extends VehicleType {
    public SkyVehicle() {
        typeName = "Sky Vehicle";
    }

    @Override
    public void move(String vehicleName) {
        System.out.println("Vehicle type: " + typeName);
        System.out.println(vehicleName + " flies...");
    }
}
