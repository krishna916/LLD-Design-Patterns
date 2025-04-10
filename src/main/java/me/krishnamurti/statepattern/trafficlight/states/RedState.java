package me.krishnamurti.statepattern.trafficlight.states;

import me.krishnamurti.statepattern.trafficlight.TrafficLight;
import me.krishnamurti.statepattern.trafficlight.TrafficLightState;

public class RedState implements TrafficLightState
{
	public void switchLight(TrafficLight context) {
		System.out.println("Switching from Red to Green");
		context.setState(new GreenState());
	}

	public String getColor() {
		return "Red";
	}
}
