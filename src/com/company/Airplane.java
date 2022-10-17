package com.company;

import com.company.interfaces.SkyVehicleInterface;
import com.company.vehicle.VehicleType;

public class Airplane extends Vehicle implements SkyVehicleInterface {
    private VehicleType vehicleType;

    public Airplane(String model, int age) {
        super(model, age);
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public void fly() {
        vehicleType.move(getClass().getSimpleName());
    }
}
