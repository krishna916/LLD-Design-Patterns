package me.krishnamurti.factorypattern.abstractFactory;

public class Application
{
	private Button button;
	private Checkbox checkbox;

	public Application(GUIFactory factory) {
		button = factory.createButton();
		checkbox = factory.createCheckbox();
	}

	public void run() {
		button.paint();
		checkbox.check();
	}

	public static void main(String[] args) {
		Application macApp = new Application(new MacFactory());
		macApp.run();

		Application winApp = new Application(new WindowsFactory());
		winApp.run();
	}
}
