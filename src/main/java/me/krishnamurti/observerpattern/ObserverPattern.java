package me.krishnamurti.observerpattern;

import me.krishnamurti.observerpattern.impl.MobileApp;
import me.krishnamurti.observerpattern.impl.TVApp;
import me.krishnamurti.observerpattern.impl.WeatherStation;

public class ObserverPattern {

    public static void main(String[] args) {
        MobileApp mobile = new MobileApp();
        TVApp tv = new TVApp();

        System.out.println("Starting weather station");
        WeatherStation station = new WeatherStation();

        station.addObserver(mobile);
        station.addObserver(tv);

        station.setTemperature(31.23f);

        mobile.display();
        tv.display();

        station.removeObserver(tv);

        station.setTemperature(50.0f);

        mobile.display();
        tv.display();

    }
}
