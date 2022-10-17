package com.company;

import com.company.vehicle.GroundVehicle;
import com.company.vehicle.SkyVehicle;

public class Main {
    public static void main(String[] args) {
        GroundVehicle groundVehicle = new GroundVehicle();
        SkyVehicle skyVehicle = new SkyVehicle();

        Auto auto = new Auto("Porsche", 2015);
        auto.setVehicleType(groundVehicle);
        auto.drive();

        Train train = new Train("U-Train", 2010);
        train.setVehicleType(groundVehicle);
        train.drive();

        Airplane airplane = new Airplane("Airbus-321", 2018);
        airplane.setVehicleType(skyVehicle);
        airplane.fly();
    }
}
