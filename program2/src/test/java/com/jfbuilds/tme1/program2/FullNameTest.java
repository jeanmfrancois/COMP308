/**
 * File Name: FullNameTest.java Jean-francois Nepton COMP 308 Java for
 * Programmers Cordinator: Dr. Xiaokun Zhang Student ID# 2358976 Created: Sep
 * 23, 2014
 */
package com.jfbuilds.tme1.program2;

import static org.junit.Assert.fail;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * FullNameTest (description of class)
 * <p>
 * (description of core fields)
 * <p>
 * (description of core methods)
 * 
 * @author Jean-francois Nepton
 * @version %I%, %G%
 * @since 1.0
 */
public class FullNameTest {

	/**
	 * Test method for {@link com.jfbuilds.tme1.program2.FullName#FullName()}.
	 */
	@Test
	public void testFullName() {
		Logger log = LogManager.getLogger("com.jfbuilds.tme1.program2");
		log.info("Performing Test:" + "testFullName - ");
		if (true) {
			assert (true);
		} else {
			fail("failMessage");
		}
	}

	/**
	 * Test method for
	 * {@link com.jfbuilds.tme1.program2.FullName#FullName(java.lang.String, java.lang.String, java.lang.String, java.lang.String)}
	 * .
	 */
	@Test
	public void testFullNameStringStringStringString() {
		Logger log = LogManager.getLogger("com.jfbuilds.tme1.program2");
		log.info("Performing Test:" + "testFullNameStringStringStringString - okie");
		if (true) {
			assert (true);
		} else {
			fail("failMessage");
		}
	}

	/**
	 * Test method for {@link com.jfbuilds.tme1.program2.FullName#toString()}.
	 */
	@Test
	public void testToString() {
		Logger log = LogManager.getLogger("com.jfbuilds.tme1.program2");
		log.info("Performing Test:" + "testToString - I doubt this is bad");
		if (true) {
			assert (true);
		} else {
			fail("did we fail again");
		}
	}
}
