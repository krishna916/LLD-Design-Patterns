package me.krishnamurti.factorypattern.abstractFactory;

public class MacOSButton implements Button
{
	@Override
	public void paint()
	{
		System.out.println("Painted MAC OS Button");
	}
}
