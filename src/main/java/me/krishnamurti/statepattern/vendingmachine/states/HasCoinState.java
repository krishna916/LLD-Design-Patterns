package me.krishnamurti.statepattern.vendingmachine.states;

import me.krishnamurti.statepattern.vendingmachine.VendingMachine;
import me.krishnamurti.statepattern.vendingmachine.VendingMachineState;

public class HasCoinState implements VendingMachineState
{
	private final VendingMachine machine;

	public HasCoinState(VendingMachine machine) {
		this.machine = machine;
	}

	public void insertCoin() {
		System.out.println("Coin already inserted");
	}

	public void ejectCoin() {
		System.out.println("Coin ejected");
		machine.setState(machine.getNoCoinState());
	}

	public void selectItem() {
		System.out.println("Item selected");
		machine.setState(machine.getSoldState());
	}

	public void dispense() {
		System.out.println("Select item first");
	}
}
