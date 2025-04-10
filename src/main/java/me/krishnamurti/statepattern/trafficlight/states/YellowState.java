package me.krishnamurti.statepattern.trafficlight.states;

import me.krishnamurti.statepattern.trafficlight.TrafficLight;
import me.krishnamurti.statepattern.trafficlight.TrafficLightState;

public class YellowState implements TrafficLightState
{
	public void switchLight(TrafficLight context) {
		System.out.println("Switching from Yellow to Red");
		context.setState(new RedState());
	}

	public String getColor() {
		return "Yellow";
	}
}
