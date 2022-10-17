package com.company;

import com.company.interfaces.GroundVehicleInterface;
import com.company.vehicle.VehicleType;

public class Auto extends Vehicle implements GroundVehicleInterface {
    private VehicleType vehicleType;

    public Auto(String model, int age) {
        super(model, age);
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public void drive() {
        System.out.println();
        vehicleType.move(getClass().getSimpleName());
    }
}
