package com.lld.design_pattern.creational.singleton;

public class LazyInitializationSingletonInstance {

	private static LazyInitializationSingletonInstance instance;

	private LazyInitializationSingletonInstance() {
	}

	public static LazyInitializationSingletonInstance getSingletonInstance() {
		if (instance == null) {
			instance = new LazyInitializationSingletonInstance();
		}
		return instance;
	}
}
