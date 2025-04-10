package me.krishnamurti.statepattern.vendingmachine.states;

import me.krishnamurti.statepattern.vendingmachine.VendingMachine;
import me.krishnamurti.statepattern.vendingmachine.VendingMachineState;

public class NoCoinState implements VendingMachineState
{
	private VendingMachine machine;

	public NoCoinState(VendingMachine machine) {
		this.machine = machine;
	}

	public void insertCoin() {
		System.out.println("Coin inserted");
		machine.setState(machine.getHasCoinState());
	}

	public void ejectCoin() {
		System.out.println("No coin to eject");
	}

	public void selectItem() {
		System.out.println("Insert coin first");
	}

	public void dispense() {
		System.out.println("Pay first");
	}
}
