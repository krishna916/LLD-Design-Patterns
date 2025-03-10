package me.krishnamurti.factorypattern.product;

public class ProductTest
{
	public static void main(String[] args)
	{
		Factory<Product> factoryA = new ConcreteFactoryA();
		Product productA = factoryA.factoryMethod();
		productA.display();

		Factory<Product> factoryB = new ConcreteFactoryB();
		Product productB = factoryB.factoryMethod();
		productB.display();

		// parameterised example
		ParameterizedFactory<Product, String> factory = new ConcreteParameterizedProductFactory();
		System.out.println();
		Product p1 = factory.factoryMethod("A");
		p1.display();

		Product p2 = factory.factoryMethod("C");
		p2.display();

		Product dp = factory.factoryMethod("random");
		dp.display();

	}
}
