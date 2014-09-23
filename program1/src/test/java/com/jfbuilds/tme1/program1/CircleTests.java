/**
 * File Name: CircleTests.java Jean-francois Nepton COMP 308 Java for
 * Programmers Cordinator: Dr. Xiaokun Zhang Student ID# 2358976 Created: Sep
 * 19, 2014
 */
package com.jfbuilds.tme1.program1;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

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
@SuiteClasses({ CircleTest.class})
public class CircleTests {
	public static final Logger log = LogManager.getLogger(CircleTests.class);
}
