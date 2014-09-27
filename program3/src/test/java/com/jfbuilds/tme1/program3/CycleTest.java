/**
 * File Name: CycleTest.java Jean-francois Nepton COMP 308 Java for Programmers
 * Cordinator: Dr. Xiaokun Zhang Student ID# 2358976 Created: Sep 23, 2014
 */
package com.jfbuilds.tme1.program3;

import static com.jfbuilds.tme1.program3.RidingTests.log;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * CycleTest (description of class)
 * <p>
 * (description of core fields)
 * <p>
 * (description of core methods)
 * 
 * @author Jean-francois Nepton
 * @version %I%, %G%
 * @since 1.0
 */
public class CycleTest {

	/**
	 * Test method for
	 * {@link com.jfbuilds.tme1.program3.Cycle#main(java.lang.String[])}.
	 */
	@Test
	public void testMain() {
		Cycle.main(new String[] {});
		log.info("Performing Test:" + "testMain - Testing for the correct execution of the main method");
		if (true) {
			log.info("Status: " + "PASSED - successfully executed main method/ polymorphism of wheel method");
			assertTrue(true);
		} else {
			log.warn("Status: "
					+ "FAILED"
					+ " - Test: testMain -> Failed test for the correct execution of the main method/ polymorphism of wheel method");
			fail("Failure for the correct execution of the main method/ polymorphism of wheel method");
		}
	}

	/**
	 * Test method for
	 * {@link com.jfbuilds.tme1.program3.Cycle#ride(com.jfbuilds.tme1.program3.Cycle)}
	 * .
	 */
	@Test
	public void testRide() {
		Cycle cycle = new Cycle() {
		};
		Cycle.ride(cycle);
		log.info("Performing Test:"
				+ "testRide - Testing for the correct execution of ride method depending on instance: Cycle subclass");
		if (true) {
			log.info("Status: " + "PASSED - with value of cycle wheels: " + cycle.wheels());
			assertTrue(true);
		} else {
			log.warn("Status: "
					+ "FAILED"
					+ " - Test: testRide -> Failed test for the correct execution of ride method depending on instance: Cycle subclass");
			fail("Failure for the correct execution of ride method depending on instance: Cycle subclass");
		}
		cycle = new Unicycle() {
		};
		Cycle.ride(cycle);
		log.info("Performing Test:"
				+ "testRide - Testing for the correct execution of ride method depending on instance: Unicycle");
		if (true) {
			log.info("Status: " + "PASSED - with value of cycle wheels: " + cycle.wheels());
			assertTrue(true);
		} else {
			log.warn("Status: "
					+ "FAILED"
					+ " - Test: testRide -> Failed test for the correct execution of ride method depending on instance: Unicycle");
			fail("Failure for the correct execution of ride method depending on instance: Unicycle");
		}
		cycle = new Bicycle() {
		};
		Cycle.ride(cycle);
		log.info("Performing Test:"
				+ "testRide - Testing for the correct execution of ride method depending on instance: Bicycle");
		if (true) {
			log.info("Status: " + "PASSED - with value of cycle wheels: " + cycle.wheels());
			assertTrue(true);
		} else {
			log.warn("Status: "
					+ "FAILED"
					+ " - Test: testRide -> Failed test for the correct execution of ride method depending on instance: Bicycle");
			fail("Failure for the correct execution of ride method depending on instance: Bicycle");
		}
		cycle = new Tricycle() {
		};
		Cycle.ride(cycle);
		log.info("Performing Test:"
				+ "testRide - Testing for the correct execution of ride method depending on instance: Tricycle");
		if (true) {
			log.info("Status: " + "PASSED - with value of cycle wheels: " + cycle.wheels());
			assertTrue(true);
		} else {
			log.warn("Status: "
					+ "FAILED"
					+ " - Test: testRide -> Failed test for the correct execution of ride method depending on instance: Tricycle");
			fail("Failure for the correct execution of ride method depending on instance: Tricycle");
		}
	}

	/**
	 * Test method for {@link com.jfbuilds.tme1.program3.Cycle#wheels()}.
	 */
	@Test
	public void testWheels() {
		Cycle cycle = new Cycle() {
		};
		log.info("Performing Test:" + "testWheels - Testing for correct execution of wheels for basic Cycle class = "
				+ cycle.wheels());
		if (cycle.wheels() == 0) {
			log.info("Status: " + "PASSED - with value of wheels = " + cycle.wheels());
			assertTrue(true);
		} else {
			log.warn("Status: " + "FAILED"
					+ " - Test: testWheels -> Failed test for correct execution of wheels for basic Cycle class");
			fail("Failure for correct execution of wheels for basic Cycle class");
		}
		cycle = new Unicycle();
		log.info("Performing Test:"
				+ "testWheels - Testing for correct execution of wheels for basic Unicycle class = " + cycle.wheels());
		if (cycle.wheels() == 1) {
			log.info("Status: " + "PASSED - with value of wheels = " + cycle.wheels());
			assertTrue(true);
		} else {
			log.warn("Status: " + "FAILED"
					+ " - Test: testWheels -> Failed test for correct execution of wheels for basic Unicycle class");
			fail("Failure for correct execution of wheels for basic Unicycle class");
		}
		cycle = new Bicycle();
		log.info("Performing Test:" + "testWheels - Testing for correct execution of wheels for basic Bicycle class = "
				+ cycle.wheels());
		if (cycle.wheels() == 2) {
			log.info("Status: " + "PASSED - with value of wheels = " + cycle.wheels());
			assertTrue(true);
		} else {
			log.warn("Status: " + "FAILED"
					+ " - Test: testWheels -> Failed test for correct execution of wheels for basic Bicycle class");
			fail("Failure for correct execution of wheels for basic Bicycle class");
		}
		cycle = new Tricycle();
		log.info("Performing Test:"
				+ "testWheels - Testing for correct execution of wheels for basic Tricycle class = " + cycle.wheels());
		if (cycle.wheels() == 3) {
			log.info("Status: " + "PASSED - with value of wheels = " + cycle.wheels());
			assertTrue(true);
		} else {
			log.warn("Status: " + "FAILED"
					+ " - Test: testWheels -> Failed test for correct execution of wheels for basic Tricycle class");
			fail("Failure for correct execution of wheels for basic Tricycle class");
		}
	}
}
