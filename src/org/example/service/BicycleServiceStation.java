package org.example.service;

import org.example.model.Bicycle;

public class BicycleServiceStation implements ServiceStation<Bicycle> {

    @Override
    public void check(Bicycle bicycle) {
        checkTyres(bicycle);
    }
}