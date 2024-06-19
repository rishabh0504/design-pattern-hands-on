package com.lld.design_pattern.creational.abstractfactory;

import com.lld.design_pattern.creational.abstractfactory.intrface.Button;
import com.lld.design_pattern.creational.abstractfactory.intrface.Checkbox;
import com.lld.design_pattern.creational.abstractfactory.intrface.ComponentFactory;

public class CustomUIManager {
	private Button button;
	private Checkbox checkbox;

	public CustomUIManager () {}
	
	public CustomUIManager(ComponentFactory componentFactoryInstance) {
		this.button = componentFactoryInstance.createButton();
		this.checkbox = componentFactoryInstance.createCheckBox();
	}

	public Button getButton() {
		return button;
	}

	public void setButton(Button button) {
		this.button = button;
	}

	public Checkbox getCheckbox() {
		return checkbox;
	}

	public void setCheckbox(Checkbox checkbox) {
		this.checkbox = checkbox;
	}
}
