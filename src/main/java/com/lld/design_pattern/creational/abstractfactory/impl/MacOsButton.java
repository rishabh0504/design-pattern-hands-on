package com.lld.design_pattern.creational.abstractfactory.impl;

import com.lld.design_pattern.creational.abstractfactory.intrface.Button;

public class MacOsButton implements Button {

	@Override
	public void render() {
		System.out.println("MacOsButton rendered");
	}

}
