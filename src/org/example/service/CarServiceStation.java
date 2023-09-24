package org.example.service;

import org.example.model.Car;

public class CarServiceStation implements ServiceStation<Car> {

    @Override
    public void check(Car car) {
        this.checkTyres(car);
        this.checkEngine();
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}