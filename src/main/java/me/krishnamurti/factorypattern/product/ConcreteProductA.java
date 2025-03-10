package me.krishnamurti.factorypattern.product;

public class ConcreteProductA implements Product
{

	@Override
	public void display()
	{
		System.out.println("Displayed from Concrete Product A");
	}
}
