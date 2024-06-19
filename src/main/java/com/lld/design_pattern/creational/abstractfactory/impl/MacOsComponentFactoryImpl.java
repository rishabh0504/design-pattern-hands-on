package com.lld.design_pattern.creational.abstractfactory.impl;

import com.lld.design_pattern.creational.abstractfactory.intrface.Button;
import com.lld.design_pattern.creational.abstractfactory.intrface.Checkbox;
import com.lld.design_pattern.creational.abstractfactory.intrface.ComponentFactory;

public class MacOsComponentFactoryImpl implements ComponentFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new MacOsButton();
	}

	@Override
	public Checkbox createCheckBox() {
		// TODO Auto-generated method stub
		return new MasOsCheckbox();
	}

}
