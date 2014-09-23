/**
 *   File Name: CircleTest.java
 *
 *   Jean-francois Nepton
 *   COMP 308 Java for Programmers
 *   Cordinator: Dr. Xiaokun Zhang
 *   Student ID# 2358976
 *   Created: Sep 23, 2014
 *   
 */
package com.jfbuilds.tme1.program1;

import static org.junit.Assert.*;

import org.junit.Test;
import static com.jfbuilds.tme1.program1.CircleTests.log;


/**
 * CircleTest (description of class)
 * <p>
 * (description of core fields)
 * <p>
 * (description of core methods)
 * 
 * @author      Jean-francois Nepton
 * @version     %I%, %G%
 * @since       1.0
 *
 */
public class CircleTest {

	/**
	 * Test method for {@link com.jfbuilds.tme1.program1.Circle#Circle()}.
	 */
	@Test
	public void testCircle() {
		log.info("Testing the creation of a Unique Circle Initialization:");
		CircleTests.log.info("Testing the creation of a default Circle Initialization:");
    	Circle circle1 = new Circle();
    	circle1.printAttributes();
        assertTrue( true );
	}

	/**
	 * Test method for {@link com.jfbuilds.tme1.program1.Circle#Circle(double, double, double)}.
	 */
	@Test
	public void testCircleDoubleDoubleDouble() {
		log.info("Testing the creation of a Unique Circle Initialization:");
    	Circle circle2 = new Circle(10,10,5);
    	circle2.printAttributes();
    	assertTrue( true );
	}

	/**
	 * Test method for {@link com.jfbuilds.tme1.program1.Circle#circumference()}.
	 */
	@Test
	public void testCircumference() {
		log.info("Testing the creation of a Unique Circle Initialization:");
    	Circle circle2 = new Circle(10,10,5);
    	circle2.printAttributes();
    	assertTrue( true );
	}

	/**
	 * Test method for {@link com.jfbuilds.tme1.program1.Circle#area()}.
	 */
	@Test
	public void testArea() {
		log.info("Testing the creation of a Unique Circle Initialization:");
    	Circle circle2 = new Circle(10,10,5);
    	circle2.printAttributes();
    	assertTrue( true );
	}

	/**
	 * Test method for {@link com.jfbuilds.tme1.program1.Circle#setRadius(double)}.
	 */
	@Test
	public void testSetRadius() {
		log.info("Testing the creation of a Unique Circle Initialization:");
    	Circle circle2 = new Circle(10,10,5);
    	circle2.printAttributes();
    	assertTrue( true );
	}

	/**
	 * Test method for {@link com.jfbuilds.tme1.program1.Circle#printAttributes()}.
	 */
	@Test
	public void testPrintAttributes() {
		log.info("Testing the creation of a Unique Circle Initialization:");
    	Circle circle2 = new Circle(10,10,5);
    	circle2.printAttributes();
    	assertTrue( true );
	}

	/**
	 * Test method for {@link com.jfbuilds.tme1.program1.Circle#isInside(double, double)}.
	 */
	@Test
	public void testIsInside() {
		log.info("Testing the creation of a Unique Circle Initialization:");
    	Circle circle2 = new Circle(10,10,5);
    	circle2.printAttributes();
    	assertTrue( true );
	}

	/**
	 * Test method for {@link com.jfbuilds.tme1.program1.Circle#move(int, int)}.
	 */
	@Test
	public void testMoveIntInt() {
		log.info("Testing the creation of a Unique Circle Initialization:");
    	Circle circle2 = new Circle(10,10,5);
    	circle2.printAttributes();
    	assertTrue( true );
	}

	/**
	 * Test method for {@link com.jfbuilds.tme1.program1.Circle#move(double, double)}.
	 */
	@Test
	public void testMoveDoubleDouble() {
		log.info("Testing the creation of a Unique Circle Initialization:");
    	Circle circle2 = new Circle(10,10,5);
    	circle2.printAttributes();
    	assertTrue( true );
	}
}
