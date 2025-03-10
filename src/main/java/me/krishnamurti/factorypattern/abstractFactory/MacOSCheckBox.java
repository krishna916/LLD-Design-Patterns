package me.krishnamurti.factorypattern.abstractFactory;

public class MacOSCheckBox implements Checkbox
{
	@Override
	public void check()
	{
		System.out.println("Checking Mac OS checkbox");
	}
}
