package me.krishnamurti.factorypattern.abstractFactory;

public class MacFactory implements GUIFactory
{
	@Override
	public Button createButton()
	{
		return new MacOSButton();
	}

	@Override
	public Checkbox createCheckbox()
	{
		return new MacOSCheckBox();
	}
}
