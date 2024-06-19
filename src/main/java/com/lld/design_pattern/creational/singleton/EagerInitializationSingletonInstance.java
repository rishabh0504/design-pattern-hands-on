package com.lld.design_pattern.creational.singleton;

public class EagerInitializationSingletonInstance {

	private static EagerInitializationSingletonInstance instance = new EagerInitializationSingletonInstance();

	private EagerInitializationSingletonInstance() {
	}

	public static EagerInitializationSingletonInstance getSingletonInstance() {
		return instance;
	}
}
