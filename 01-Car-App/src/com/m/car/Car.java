package com.m.car;

public class Car extends Engine {

	public void drive() {
		int status = super.start();

		if (status >= 1) {
			System.out.println("journey start");
		} else {
			System.out.println("Engine Trouble....");
		}
	}

}
