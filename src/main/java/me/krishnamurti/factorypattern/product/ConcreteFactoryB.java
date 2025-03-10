package me.krishnamurti.factorypattern.product;

public class ConcreteFactoryB implements Factory<Product>
{

	@Override
	public Product factoryMethod()
	{
		return new ConcreteProductB();
	}
}
