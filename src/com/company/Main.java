package com.company;

import com.company.abstractions.VehicleMovement;
import com.company.modules.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Auto auto = new Auto("Porsche", 2015);
        Train train = new Train("U-Train", 2010);
        Airplane airplane = new Airplane("Airbus-321", 2012);

        List<VehicleMovement> vehicles = new ArrayList<>();
        vehicles.add(auto);
        vehicles.add(train);
        vehicles.add(airplane);

        Movement movement = new Movement(vehicles);
        movement.implement();

    }
}
