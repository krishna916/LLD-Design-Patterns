package me.krishnamurti.observerpattern.impl;

import me.krishnamurti.observerpattern.Observer;

public class MobileApp implements Observer {
    private float currentTemperature;

    @Override
    public void update(float update) {
        this.currentTemperature = update;
    }

    public float currentTemperature()
    {
        return this.currentTemperature;
    }

    public void display() {
        System.out.println("Mobile screen says: " + currentTemperature);
    }


}
