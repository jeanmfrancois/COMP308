/**
 * File Name: Cycle.java<br>
 * Jean-francois Nepton.<br>
 * COMP 308 Java for Programmers<br>
 * Cordinator: Dr. Xiaokun Zhang<br>
 * Student ID# 2358976<br>
 * Created: Sep 19, 2014
 */
package com.jfbuilds.tme1.program3;

/**
 * Cycle class represent a cycle device with subclasses of Unicycle, Bicycle,
 * and Tricycle
 * <p>
 * There are no fields associated for a cycle
 * <p>
 * Static method to ride any cycle device (with possible upcasting) as well as a
 * method to return related number of wheels on the device
 * 
 * @author Jean-francois Nepton
 * @version %I%, %G%
 * @since 1.0
 */
public abstract class Cycle {

	/**
	 * Entry point to test a Cycle object
	 * 
	 * @param args
	 *            used only to support signature
	 */
	public static void main(String[] args) {
		System.out.println("Creating an instance of a basic Cycle subclass object.");
		Cycle bike0 = new Cycle() {
		};
		System.out.println("Creating instances of subclasses Unicycle, Bicycle, and Tricycle objects.");
		Unicycle bike1 = new Unicycle();
		Bicycle bike2 = new Bicycle();
		Tricycle bike3 = new Tricycle();
		System.out.println("Executing static method ride with subclasses, use up upcasting when needed.");
		ride(bike0);
		ride(bike1);
		ride(bike2);
		ride(bike3);
		System.out.println("Exiting main method.");
	}

	/**
	 * Used to simulate the ability to ride an object if it is a "Cycle" type
	 * 
	 * @param cycle
	 *            An object with core cycle properties
	 */
	public static void ride(Cycle cycle) {
		System.out.println("Current cycle has " + cycle.wheels() + " wheels");
	}

	/**
	 * The number of wheels attached to the device
	 * 
	 * @return int number of wheels
	 */
	public int wheels() {
		System.out.println("Can not ride with no wheels");
		return 0;
	}
}

/**
 * Unicycle class is a direct cycle subclass with an additional wheel
 * 
 * @author Jean-francois Nepton
 * @version %I%, %G%
 * @since 1.0
 */
class Unicycle extends Cycle {

	/**
	 * @see com.jfbuilds.tme1.program3.Cycle#wheels()
	 */
	@Override
	public int wheels() {
		System.out.println("Riding a Unicycle");
		return 1;
	}
}

/**
 * Bicycle class is a direct cycle subclass with an additional 2 wheels
 * 
 * @author Jean-francois Nepton
 * @version %I%, %G%
 * @since 1.0
 */
class Bicycle extends Cycle {

	/**
	 * @see com.jfbuilds.tme1.program3.Cycle#wheels()
	 */
	@Override
	public int wheels() {
		System.out.println("Riding a Bicycle");
		return 2;
	}
}

/**
 * Tricycle class is a direct cycle subclass with an additional 3 wheels
 * 
 * @author Jean-francois Nepton
 * @version %I%, %G%
 * @since 1.0
 */
class Tricycle extends Cycle {

	/**
	 * @see com.jfbuilds.tme1.program3.Cycle#wheels()
	 */
	@Override
	public int wheels() {
		System.out.println("Riding a Tricycle");
		return 3;
	}
}
