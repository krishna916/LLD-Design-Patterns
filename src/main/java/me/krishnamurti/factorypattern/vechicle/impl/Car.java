package me.krishnamurti.factorypattern.vechicle.impl;

import me.krishnamurti.factorypattern.vechicle.Vehicle;

public class Car implements Vehicle
{
	@Override
	public void drive()
	{
		System.out.println("Driving a car");
	}
}
