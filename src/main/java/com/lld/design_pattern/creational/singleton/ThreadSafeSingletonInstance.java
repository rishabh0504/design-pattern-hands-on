package com.lld.design_pattern.creational.singleton;

public class ThreadSafeSingletonInstance {

	private static ThreadSafeSingletonInstance instance;
	private ThreadSafeSingletonInstance() {}
	
	public static synchronized ThreadSafeSingletonInstance getSingletonInstance() {
		if (instance == null) {
			instance = new ThreadSafeSingletonInstance();
		}
		return instance;
	}
}
