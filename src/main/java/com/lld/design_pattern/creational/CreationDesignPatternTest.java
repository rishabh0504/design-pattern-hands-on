package com.lld.design_pattern.creational;

import com.lld.design_pattern.creational.abstractfactory.CustomUIManager;
import com.lld.design_pattern.creational.abstractfactory.impl.MacOsButton;
import com.lld.design_pattern.creational.abstractfactory.impl.MacOsComponentFactoryImpl;
import com.lld.design_pattern.creational.abstractfactory.impl.WindowsButton;
import com.lld.design_pattern.creational.abstractfactory.intrface.Button;
import com.lld.design_pattern.creational.builder.House;
import com.lld.design_pattern.creational.factory.impl.DocxgeneratorImpl;
import com.lld.design_pattern.creational.factory.impl.FactoryPatternDocxGeneratorImpl;
import com.lld.design_pattern.creational.factory.impl.PDFgeneratorImpl;
import com.lld.design_pattern.creational.factory.intrface.DocGeneratorInterface;
import com.lld.design_pattern.creational.factory.intrface.FactoryPatternInterface;
import com.lld.design_pattern.creational.prototype.impl.Circle;
import com.lld.design_pattern.creational.prototype.impl.Rectangle;
import com.lld.design_pattern.creational.singleton.EagerInitializationSingletonInstance;
import com.lld.design_pattern.creational.singleton.LazyInitializationSingletonInstance;
import com.lld.design_pattern.creational.singleton.ThreadSafeSingletonInstance;

public class CreationDesignPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// SingletonPatternTest Testing start
		// ===================================
		EagerInitializationSingletonInstance instance1 = EagerInitializationSingletonInstance.getSingletonInstance();
		EagerInitializationSingletonInstance instance2 = EagerInitializationSingletonInstance.getSingletonInstance();
		System.out.println(instance1 == instance2);

		LazyInitializationSingletonInstance instance3 = LazyInitializationSingletonInstance.getSingletonInstance();
		LazyInitializationSingletonInstance instance4 = LazyInitializationSingletonInstance.getSingletonInstance();
		System.out.println(instance3 == instance4);

		ThreadSafeSingletonInstance instance5 = ThreadSafeSingletonInstance.getSingletonInstance();
		ThreadSafeSingletonInstance instance6 = ThreadSafeSingletonInstance.getSingletonInstance();
		System.out.println(instance5 == instance6);
		// SingletonPatternTest Testing end
		// ===================================

		// FactoryPatternInterface Testing start
		// ===================================
		FactoryPatternInterface factoryInstance = new FactoryPatternDocxGeneratorImpl();
		DocGeneratorInterface instance = factoryInstance.createInstance();
		System.out.println(instance instanceof PDFgeneratorImpl); // false
		System.out.println(instance instanceof DocxgeneratorImpl); // true
		// FactoryPatternInterface Testing end
		// ===================================

		// AbstractFactoryTest Testing start
		// ===================================
		CustomUIManager manager = new CustomUIManager(new MacOsComponentFactoryImpl());
		Button btn = manager.getButton();
		System.out.println(btn instanceof MacOsButton);
		System.out.println(btn instanceof WindowsButton);
		// AbstractFactoryTest Testing end
		// ===================================

		// BuilderPatter Testing start
		// ===================================
		House house = new House.HouseBuilder().setWindows(4).setDoors(2).setRoof(true).setGarage(true)
				.setSwimmingPool(false).build();
		System.out.println(house);
		// BuilderPatter Testing end
		// ===================================
		
		// Prototype Testing start
		// ===================================
		Circle originalCircle = new Circle(10);
        Circle clonedCircle = (Circle) originalCircle.clone();

        System.out.println("Original Circle:");
        originalCircle.draw();

        System.out.println("Cloned Circle:");
        clonedCircle.draw();

        Rectangle originalRectangle = new Rectangle(20, 30);
        Rectangle clonedRectangle = (Rectangle) originalRectangle.clone();

        System.out.println("Original Rectangle:");
        originalRectangle.draw();

        System.out.println("Cloned Rectangle:");
        clonedRectangle.draw();
		// Prototype Testing end
		// ===================================
	}

}
