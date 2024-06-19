package com.lld.design_pattern.creational.abstractfactory.impl;

import com.lld.design_pattern.creational.abstractfactory.intrface.Checkbox;

public class MasOsCheckbox implements Checkbox{
	@Override
	public void render() {
		System.out.println("MasOsCheckbox rendered");
	}
}
