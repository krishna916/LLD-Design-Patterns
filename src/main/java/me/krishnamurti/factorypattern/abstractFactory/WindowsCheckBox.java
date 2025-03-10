package me.krishnamurti.factorypattern.abstractFactory;

public class WindowsCheckBox implements Checkbox
{
	@Override
	public void check()
	{
		System.out.println("Checking windows Checkbox");
	}
}
