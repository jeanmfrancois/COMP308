/**
 *   File Name: CircleTests.java
 *
 *   Jean-francois Nepton
 *   COMP 308 Java for Programmers
 *   Cordinator: Dr. Xiaokun Zhang
 *   Student ID# 2358976
 *   Created: Sep 19, 2014
 *   
 */
package com.jfbuilds.tme1.program1;

import org.apache.log4j.PropertyConfigurator;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * CircleTests (description of class)
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
@RunWith(Suite.class)
@SuiteClasses({ CircleInitializationTest.class, CircumferenceTest.class})
public class CircleTests {
	
	
	public static final Logger log = LoggerFactory.getLogger(CircleTests.class);
	
	static {
		PropertyConfigurator.configure("properties/log4j.properties");
	}
	
 public static void main(String[] args) {
	 System.out.println("Executing Tests:");
	 log.info("Testing the logging system:");
 	
	 CircleInitializationTest test1 = new CircleInitializationTest();
	 test1.testCircle();
	 test1.testCircleDoubleDoubleDouble();
	 
	 //CircumferenceTest test2 = new CircumferenceTest();
	 //test2.testCircumference();
 }
}
