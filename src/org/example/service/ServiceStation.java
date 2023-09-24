package org.example.service;

import org.example.model.Vehicle;

public interface ServiceStation<T extends Vehicle> {

    void check(T vehicle);

    default void checkTyres(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            System.out.println("Меняем покрышку");
        }
    }
}