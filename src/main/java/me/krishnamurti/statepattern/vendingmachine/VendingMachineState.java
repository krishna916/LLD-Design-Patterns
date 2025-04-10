package me.krishnamurti.statepattern.vendingmachine;

// state interface
public interface VendingMachineState
{
	void insertCoin();
	void ejectCoin();
	void selectItem();
	void dispense();
}
