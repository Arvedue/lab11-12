package com.company.modules;

import com.company.abstractions.VehicleMovement;

import java.util.List;

public class Movement {
    private final List<VehicleMovement> vehicleMovementList;

    public Movement(List<VehicleMovement> vehicles) {
        this.vehicleMovementList = vehicles;
    }

    public void implement() {
        for (VehicleMovement vehicleMovement : vehicleMovementList)
            vehicleMovement.move();
    }
}
