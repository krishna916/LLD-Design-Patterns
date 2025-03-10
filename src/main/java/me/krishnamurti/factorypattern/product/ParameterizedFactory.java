package me.krishnamurti.factorypattern.product;

public interface ParameterizedFactory<R, T>
{
	R factoryMethod(T type);
}
