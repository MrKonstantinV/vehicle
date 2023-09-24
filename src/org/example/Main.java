package org.example;

import org.example.model.Bicycle;
import org.example.model.Car;
import org.example.model.Truck;
import org.example.model.Vehicle;
import org.example.service.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        var vehicles = List.of(
                new Car("car1", 4),
                new Truck("truck1", 6),
                new Bicycle("bicycle1", 2));

        var vehicleService = new VehicleService();

        vehicles.forEach(vehicleService::check);
    }
}