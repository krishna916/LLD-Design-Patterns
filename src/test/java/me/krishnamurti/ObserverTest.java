package me.krishnamurti;

import me.krishnamurti.observerpattern.impl.MobileApp;
import me.krishnamurti.observerpattern.impl.TVApp;
import me.krishnamurti.observerpattern.impl.WeatherStation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObserverTest {
    @Test
    public void test() {
        MobileApp mobile = new MobileApp();
        TVApp tv = new TVApp();


        WeatherStation station = new WeatherStation();

        station.addObserver(mobile);
        station.addObserver(tv);

        station.setTemperature(31.23f);

        assertEquals(31.23f, mobile.currentTemperature());
        assertEquals(31.23f, tv.currentTemperature());
    }
}
