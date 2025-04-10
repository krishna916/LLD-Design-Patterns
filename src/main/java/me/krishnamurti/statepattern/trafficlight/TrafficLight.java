package me.krishnamurti.statepattern.trafficlight;

import me.krishnamurti.statepattern.trafficlight.states.RedState;

// context
public class TrafficLight
{
	private TrafficLightState state;

	public TrafficLight() {
		this.state = new RedState();
	}

	public void setState(TrafficLightState state) {
		this.state = state;
	}

	public void change() {
		state.switchLight(this);
	}

	public String getCurrentColor() {
		return state.getColor();
	}
}
