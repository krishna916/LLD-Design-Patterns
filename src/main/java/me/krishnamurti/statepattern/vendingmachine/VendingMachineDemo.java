package me.krishnamurti.statepattern.vendingmachine;

public class VendingMachineDemo
{
	public static void main(String[] args) {
		VendingMachine machine = new VendingMachine();

		machine.insertCoin();  // Coin inserted

		machine.ejectCoin(); // cancel operation


		machine.insertCoin(); // restart again
		machine.selectItem();  // Item selected
		machine.dispense();    // Item dispensed
		machine.insertCoin();  // Coin inserted (back to NoCoinState after dispense)
	}
}
