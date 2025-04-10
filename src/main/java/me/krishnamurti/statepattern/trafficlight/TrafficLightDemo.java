package me.krishnamurti.statepattern.trafficlight;

public class TrafficLightDemo
{
	public static void main(String[] args) {
		TrafficLight light = new TrafficLight();

		System.out.println("Current light: " + light.getCurrentColor()); // Current light: Red
		light.change();  // Switching from Red to Green
		System.out.println("Current light: " + light.getCurrentColor()); // Current light: Green
		light.change();  // Switching from Green to Yellow
		System.out.println("Current light: " + light.getCurrentColor()); // Current light: Yellow
	}
}
