package com.company.vehicle;

public class GroundVehicle extends VehicleType {

    public GroundVehicle() {
        typeName = "Ground Vehicle";
    }

    @Override
    public void move(String vehicleName) {
        System.out.println("Vehicle type: " + typeName);
        System.out.println(vehicleName + " drives...");
    }

}