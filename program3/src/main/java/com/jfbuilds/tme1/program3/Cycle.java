/**
 * File Name: Cycle.java Jean-francois Nepton COMP 308 Java for Programmers
 * Cordinator: Dr. Xiaokun Zhang Student ID# 2358976 Created: Sep 19, 2014
 */
package com.jfbuilds.tme1.program3;

/**
 * Cycle (description of class)
 * <p>
 * (description of core fields)
 * <p>
 * (description of core methods)
 * 
 * @author Jean-francois Nepton
 * @version %I%, %G%
 * @since 1.0
 */
public class Cycle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cycle bike0 = new Cycle();
		Unicycle bike1 = new Unicycle();
		Bicycle bike2 = new Bicycle();
		Tricycle bike3 = new Tricycle();
		ride(bike0);
		ride(bike1);
		ride(bike2);
		ride(bike3);
	}

	/**
	 * @param cycle
	 *            An object that will be upcasted to Cycle
	 */
	public static void ride(Cycle cycle) {
		System.out.println("Current cycle has " + cycle.wheels() + " wheels");
	}

	/**
	 * @param cycle
	 *            An object that will be upcasted to Cycle
	 */
	public int wheels() {
		System.out.println("Can not ride with no wheels");
		return 0;
	}
}

class Unicycle extends Cycle {

	/**
	 * @param cycle
	 *            An object that will be upcasted to Cycle
	 */
	public int wheels() {
		System.out.println("Riding a Unicycle");
		return 1;
	}
}

class Bicycle extends Cycle {

	public int wheels() {
		System.out.println("Riding a Bicycle");
		return 2;
	}
}

class Tricycle extends Cycle {

	public int wheels() {
		System.out.println("Riding a Tricycle");
		return 3;
	}
}
