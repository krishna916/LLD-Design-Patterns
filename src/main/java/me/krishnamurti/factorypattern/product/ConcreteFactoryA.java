package me.krishnamurti.factorypattern.product;

public class ConcreteFactoryA implements Factory<Product>
{
	@Override
	public Product factoryMethod()
	{
		return new ConcreteProductA();
	}
}
