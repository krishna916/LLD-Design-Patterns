package me.krishnamurti.statepattern.trafficlight;

public interface TrafficLightState
{
	void switchLight(TrafficLight context);
	String getColor();
}
