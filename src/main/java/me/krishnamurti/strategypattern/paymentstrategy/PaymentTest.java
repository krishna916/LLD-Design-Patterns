package me.krishnamurti.strategypattern.paymentstrategy;

public class PaymentTest
{
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();

		// Pay by credit card
		cart.pay(new CreditCardStrategy("John Doe", "1234567890123456", "123", "12/25"), 100);

		// Pay by Paypal
		cart.pay(new PaypalStrategy("john@example.com", "password123"), 130);
	}
}
