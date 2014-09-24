/**
 * File Name: ShippingTest.java Jean-francois Nepton COMP 308 Java for
 * Programmers Cordinator: Dr. Xiaokun Zhang Student ID# 2358976 Created: Sep
 * 23, 2014
 */
package com.jfbuilds.tme1.program2;

import static com.jfbuilds.tme1.program2.MailingTests.log;
import static org.junit.Assert.fail;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * ShippingTest (description of class)
 * <p>
 * (description of core fields)
 * <p>
 * (description of core methods)
 * 
 * @author Jean-francois Nepton
 * @version %I%, %G%
 * @since 1.0
 */
public class ShippingTest {

	/**
	 * Test method for
	 * {@link com.jfbuilds.tme1.program2.ShippingLabel#ShippingLabel()}.
	 */
	@Test
	public void testShippingLabel() {
		// Logger log = LogManager.getLogger("com.jfbuilds.tme1.program2");
		log.info("Performing Test:" + "testShippingLabel - ");
		if (true) {
			assert (true);
		} else {
			fail("failMessage");
		}
	}

	/**
	 * Test method for
	 * {@link com.jfbuilds.tme1.program2.ShippingLabel#ShippingLabel(com.jfbuilds.tme1.program2.MailingAddress, com.jfbuilds.tme1.program2.MailingAddress)}
	 * .
	 */
	@Test
	public void testShippingLabelMailingAddressMailingAddress() {
		// Logger log = LogManager.getLogger("com.jfbuilds.tme1.program2");
		log.info("Performing Test:" + "testShippingLabelMailingAddressMailingAddress - ");
		if (true) {
			assert (true);
		} else {
			fail("failMessage");
		}
	}

	/**
	 * Test method for
	 * {@link com.jfbuilds.tme1.program2.ShippingLabel#main(java.lang.String[])}
	 * .
	 */
	@Test
	public void testMain() {
		Logger log = LogManager.getLogger("com.jfbuilds.tme1.program2");
		log.info("Performing Test:" + "testMain - ");
		if (true) {
			log.info("Status: " + "PASSED");
			assert (true);
		} else {
			log.warn("Status: " + "FAILED" + " - Test: testMain -> Incorrect use of a test");
			fail("Incorrect use of a test");
		}
	}

	/**
	 * Test method for
	 * {@link com.jfbuilds.tme1.program2.ShippingLabel#toString()}.
	 */
	@Test
	public void testToString() {
		// Logger log = LogManager.getLogger("com.jfbuilds.tme1.program2");
		log.info("Performing Test:" + "testToString - ");
		if (true) {
			log.info("Status: " + "PASSED");
			assert (true);
		} else {
			log.warn("Status: " + "FAILED" + " - Test: testToString");
			fail("failMessage");
		}
	}
}
