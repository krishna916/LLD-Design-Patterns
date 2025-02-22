package me.krishnamurti;

import me.krishnamurti.observerpattern.Observer;
import me.krishnamurti.observerpattern.impl.MobileApp;
import me.krishnamurti.observerpattern.impl.TVApp;
import me.krishnamurti.observerpattern.impl.WeatherStation;

public class ObserverTest {

    public void test() {
        Observer mobile = new MobileApp();
        Observer tv = new TVApp();


        WeatherStation station = new WeatherStation();

        station.addObserver(mobile);
        station.addObserver(tv);

        station.setTemperature(31.23f);
    }
}
