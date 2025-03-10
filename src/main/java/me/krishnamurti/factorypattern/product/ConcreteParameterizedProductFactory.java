package me.krishnamurti.factorypattern.product;

public class ConcreteParameterizedProductFactory implements ParameterizedFactory<Product, String>
{
	@Override
	public Product factoryMethod(String type)
	{
		String lType = type.toLowerCase();
		switch (lType) {
			case  "a": {
				return new ConcreteProductA();
			}
			case "b": {
				return new ConcreteProductB();
			}
			case "c": {
				return new ConcreteProductC();
			}
			default: {
				// use this block to return default Product if any
				return new ConcreteProductA();
			}
		}
	}
}
