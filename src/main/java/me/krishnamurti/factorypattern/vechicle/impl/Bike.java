package me.krishnamurti.factorypattern.vechicle.impl;

import me.krishnamurti.factorypattern.vechicle.Vehicle;

public class Bike implements Vehicle
{
	@Override
	public void drive()
	{
		System.out.println("Riding a Bike");
	}
}
