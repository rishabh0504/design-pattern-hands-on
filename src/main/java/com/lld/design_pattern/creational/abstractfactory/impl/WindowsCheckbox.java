package com.lld.design_pattern.creational.abstractfactory.impl;

import com.lld.design_pattern.creational.abstractfactory.intrface.Checkbox;

public class WindowsCheckbox  implements Checkbox{
	@Override
	public void render() {
		System.out.println("WindowsCheckbox rendered");
	}
}
