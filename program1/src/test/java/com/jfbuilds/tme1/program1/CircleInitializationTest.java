/**
 *   File Name: CircleInitializationTest.java
 *
 *   Jean-francois Nepton
 *   COMP 308 Java for Programmers
 *   Cordinator: Dr. Xiaokun Zhang
 *   Student ID# 2358976
 *   Created: Sep 19, 2014
 *   
 */
package com.jfbuilds.tme1.program1;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * CircleInitializationTest (description of class)
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
public class CircleInitializationTest {
	
	/**
	 * Test method for {@link com.jfbuilds.tme1.program1.Circle#Circle()}.
	 */
	@Test
	public void testCircle() {
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
    	CircleTests.log.info("Testing the creation of a Unique Circle Initialization:");
    	Circle circle2 = new Circle(10,10,5);
    	circle2.printAttributes();
    	assertTrue( true );
	}
}
