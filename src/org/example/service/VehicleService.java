package org.example.service;

import org.example.model.Bicycle;
import org.example.model.Car;
import org.example.model.Truck;
import org.example.model.Vehicle;

public class VehicleService {

    public void check(Vehicle vehicle) {
        if (vehicle instanceof Car car) {
            new CarServiceStation().check(car);
        } else if (vehicle instanceof Bicycle bicycle) {
            new BicycleServiceStation().check(bicycle);
        } else if (vehicle instanceof Truck truck) {
            new TruckServiceStation().check(truck);
        }
    }
}