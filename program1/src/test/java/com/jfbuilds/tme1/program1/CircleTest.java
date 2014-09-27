/**
 * File Name: CircleTest.java Jean-francois Nepton COMP 308 Java for Programmers
 * Cordinator: Dr. Xiaokun Zhang Student ID# 2358976 Created: Sep 23, 2014
 */
package com.jfbuilds.tme1.program1;

import static com.jfbuilds.tme1.program1.CircleTests.log;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * CircleTest (description of class)
 * <p>
 * (description of core fields)
 * <p>
 * (description of core methods)
 * 
 * @author Jean-francois Nepton
 * @version %I%, %G%
 * @since 1.0
 */
public class CircleTest {

	/**
	 * Test method for {@link com.jfbuilds.tme1.program1.Circle#Circle()}.
	 */
	@Test
	public void testCircle() {
		log.info("Performing Test:"
				+ "testCircle - Testing the creation on a default Circle with Center point (10,-10) and radius of 8");
		Circle circle = new Circle();
		if (circle != null) {
			log.debug("Status: " + "PASSED\n" + circle.getAttributes());
			assertTrue(true);
		} else {
			log.warn("Status: " + "FAILED" + " - Test: testCircle -> Could not create a Circle object");
			fail("Could not create a Circle object");
		}
	}

	/**
	 * Test method for
	 * {@link com.jfbuilds.tme1.program1.Circle#Circle(double, double, double)}.
	 */
	@Test
	public void testCircleDoubleDoubleDouble() {
		log.info("Performing Test:"
				+ "testCircleDoubleDoubleDouble - Testing the creation of a Circle with supplied parameters (25, 25) radius 15");
		Circle circle = new Circle(25, 25, 15);
		if (circle != null) {
			log.debug("Status: " + "PASSED\n" + circle.getAttributes());
			assertTrue(true);
		} else {
			log.warn("Status: " + "FAILED"
					+ " - Test: testCircleDoubleDoubleDouble -> Could not create a Circle with provided arguments");
			fail("Could not create a Circle with provided arguments");
		}
	}

	/**
	 * Test method for {@link com.jfbuilds.tme1.program1.Circle#circumference()}
	 * .
	 */
	@Test
	public void testCircumference() {
		Circle circle = new Circle();
		log.info("Performing Test:"
				+ "testCircumference - Testing the circumference method of a default circle to equal Pie*(2r)");
		if (circle.circumference() == Math.PI * (2 * 8)) {
			log.debug("Status: " + "PASSED - Circumference is calculated correctly");
			assertTrue(true);
		} else {
			log.warn("Status: " + "FAILED"
					+ " - Test: testCircumference -> Failed to create a circle with correct circumference");
			fail("Failed to create a circle with correct circumference");
		}
	}

	/**
	 * Test method for {@link com.jfbuilds.tme1.program1.Circle#area()}.
	 */
	@Test
	public void testArea() {
		Circle circle = new Circle();
		log.info("Performing Test:" + "testArea - Test if the area of a circle with a radius of 8 will produce 201.06");
		if (circle.area() == Math.PI * 64) {
			log.debug("Status: " + "PASSED - Area of circle returned " + circle.area());
			assertTrue(true);
		} else {
			log.warn("Status: "
					+ "FAILED"
					+ " - Test: testArea -> The calculated area did not return the proper area for a circle with radius of 8");
			fail("The calculated area did not return the proper area for a circle with radius of 8");
		}
	}

	/**
	 * Test method for
	 * {@link com.jfbuilds.tme1.program1.Circle#setRadius(double)}.
	 */
	@Test
	public void testSetRadius() {
		Circle circle = new Circle();
		circle.setRadius(204);
		log.info("Performing Test:" + "testSetRadius - Testing method setRadius to set a max value of "
				+ Circle.MAX_RADIUS + " when given a value to be set of 204");
		if (circle.r == Circle.MAX_RADIUS) {
			log.debug("Status: " + "PASSED - radius is at max of " + Circle.MAX_RADIUS);
			assertTrue(true);
		} else {
			log.warn("Status: " + "FAILED"
					+ " - Test: testSetRadius -> Failed to set radius to Max value when exceeding that value");
			fail("Failed to set radius to Max value when exceeding that value");
		}
	}

	/**
	 * Test method for
	 * {@link com.jfbuilds.tme1.program1.Circle#isInside(double, double)}.
	 */
	@Test
	public void testIsInside() {
		Circle circle = new Circle();
		log.info("Performing Test:"
				+ "testIsInside - Test whether a point (12,-12) which should be in a circle with center of (10,-10) and radius of 8 returns true");
		if (circle.isInside(12, -12) == true) {
			log.debug("Status: " + "PASSED");
			assertTrue(true);
		} else {
			log.warn("Status: "
					+ "FAILED"
					+ " - Test: testIsInside -> Point (12, -12) incorrectly did not return true for being in circle at point (10, -10) with radius of 8");
			fail("Point (12, -12) incorrectly did not return true for being in circle at point (10, -10) with radius of 8");
		}
		log.info("Performing Test:"
				+ "testIsInside - Test whether a point (-12, 12) which should NOT be in a circle with center of (10,-10) and radius of 8 returns false");
		if (circle.isInside(-12, 12) == false) {
			log.debug("Status: " + "PASSED");
			assertTrue(true);
		} else {
			log.warn("Status: "
					+ "FAILED"
					+ " - Test: testIsInside -> Point (-12, 12) incorrectly did not return false for being outside circle at point (10, -10) with radius of 8");
			fail("Point (12, -12) incorrectly did not return false for being outside circle at point (10, -10) with radius of 8");
		}
		log.info("Performing Test:"
				+ "testIsInside - Test whether a point (10, -2) which is on the edge of a circle should NOT be in a circle at point (10, -10) with radius of 8 returns false");
		if (circle.isInside(10, -2) == false) {
			log.debug("Status: " + "PASSED");
			assertTrue(true);
		} else {
			log.warn("Status: "
					+ "FAILED"
					+ " - Test: testIsInside -> Point (12, -12) incorrectly did not return false for being outside circle at point (12, -12) with radius of 8");
			fail("Point (12, -12) incorrectly did not return false for being outside circle at point (12, -12) with radius of 8");
		}
	}

	/**
	 * Test method for {@link com.jfbuilds.tme1.program1.Circle#move(int, int)}.
	 */
	@Test
	public void testMoveIntInt() {
		Circle circle = new Circle();
		circle.move(3, 3);
		log.info("Performing Test:"
				+ "testMoveIntInt - Test the move method moves the center by 3 int units on both x and y axis");
		if (circle.x == 13 && circle.y == -7) {
			log.debug("Status: " + "PASSED - new cordinates are (" + circle.x + "," + circle.y + ")");
			assertTrue(true);
		} else {
			log.warn("Status: " + "FAILED"
					+ " - Test: testMoveIntInt -> Failed to move circle to correct new coordinates x+3 y+3");
			fail("Failed to move circle to correct new coordinates x+3 y+3");
		}
	}

	/**
	 * Test method for
	 * {@link com.jfbuilds.tme1.program1.Circle#move(double, double)}.
	 */
	@Test
	public void testMoveDoubleDouble() {
		Circle circle = new Circle();
		circle.move(-4.0, -4.0);
		log.info("Performing Test:"
				+ "testMoveDoubleDouble - Test the move method moves the center by -4.0 double units on both x and y axis");
		if (circle.x == 6 && circle.y == -14) {
			log.debug("Status: " + "PASSED - new cordinates are (" + circle.x + "," + circle.y + ")");
			assertTrue(true);
		} else {
			log.warn("Status: " + "FAILED"
					+ " - Test: testMoveIntInt -> Failed to move circle to correct new coordinates x-4 y-4");
			fail("Failed to move circle to correct new coordinates x-4 y-4");
		}
	}
}
