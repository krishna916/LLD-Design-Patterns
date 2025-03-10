package me.krishnamurti.factorypattern.abstractFactory;

public class WindowsButton implements Button
{
	@Override
	public void paint()
	{
		System.out.println("Painted Windows Button");
	}
}
