package me.krishnamurti.statepattern.vendingmachine.states;

import me.krishnamurti.statepattern.vendingmachine.VendingMachine;
import me.krishnamurti.statepattern.vendingmachine.VendingMachineState;

public class SoldState implements VendingMachineState
{
	private final VendingMachine machine;

	public SoldState(VendingMachine machine) {
		this.machine = machine;
	}

	public void insertCoin() {
		System.out.println("Please wait, dispensing item");
	}

	public void ejectCoin() {
		System.out.println("Too late, item already selected");
	}

	public void selectItem() {
		System.out.println("Already dispensing an item");
	}

	public void dispense() {
		System.out.println("Item dispensed");
		machine.setState(machine.getNoCoinState());
	}
}
