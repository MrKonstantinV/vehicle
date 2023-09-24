package org.example.service;

import org.example.model.Truck;

public class TruckServiceStation implements ServiceStation<Truck> {

    @Override
    public void check(Truck truck) {
        this.checkTyres(truck);
        this.checkEngine();
        this.checkTrailer();
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    private void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}