package me.krishnamurti.statepattern.vendingmachine;

import me.krishnamurti.statepattern.vendingmachine.states.HasCoinState;
import me.krishnamurti.statepattern.vendingmachine.states.NoCoinState;
import me.krishnamurti.statepattern.vendingmachine.states.SoldState;

// context
public class VendingMachine
{
	private VendingMachineState noCoinState;
	private VendingMachineState hasCoinState;
	private VendingMachineState soldState;
	private VendingMachineState currentState;

	public VendingMachine() {
		noCoinState = new NoCoinState(this);
		hasCoinState = new HasCoinState(this);
		soldState = new SoldState(this);
		currentState = noCoinState;
	}

	public void setState(VendingMachineState state) {
		this.currentState = state;
	}

	public VendingMachineState getNoCoinState() { return noCoinState; }
	public VendingMachineState getHasCoinState() { return hasCoinState; }
	public VendingMachineState getSoldState() { return soldState; }

	public void insertCoin() { currentState.insertCoin(); }
	public void ejectCoin() { currentState.ejectCoin(); }
	public void selectItem() { currentState.selectItem(); }
	public void dispense() { currentState.dispense(); }
}
