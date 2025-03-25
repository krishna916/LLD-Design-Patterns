package me.krishnamurti.strategypattern.paymentstrategy;

public class ShoppingCart
{
	public void pay(PaymentStrategy strategy, int amount) {
		strategy.pay(amount);
	}
}
