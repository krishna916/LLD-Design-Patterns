package me.krishnamurti.statepattern.trafficlight.states;

import me.krishnamurti.statepattern.trafficlight.TrafficLight;
import me.krishnamurti.statepattern.trafficlight.TrafficLightState;

public class GreenState implements TrafficLightState
{
	public void switchLight(TrafficLight context) {
		System.out.println("Switching from Green to Yellow");
		context.setState(new YellowState());
	}

	public String getColor() {
		return "Green";
	}
}
