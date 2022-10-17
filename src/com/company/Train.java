package com.company;

import com.company.interfaces.GroundVehicleInterface;
import com.company.vehicle.VehicleType;

public class Train extends Vehicle implements GroundVehicleInterface {
    private VehicleType vehicleType;

    public Train(String model, int age) {
        super(model, age);
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public void drive() {
        vehicleType.move(getClass().getSimpleName());
    }
}
