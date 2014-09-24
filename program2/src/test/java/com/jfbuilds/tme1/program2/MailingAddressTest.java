/**
 * File Name: MailingAddressTest.java Jean-francois Nepton COMP 308 Java for
 * Programmers Cordinator: Dr. Xiaokun Zhang Student ID# 2358976 Created: Sep
 * 23, 2014
 */
package com.jfbuilds.tme1.program2;

import static org.junit.Assert.fail;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * MailingAddressTest (description of class)
 * <p>
 * (description of core fields)
 * <p>
 * (description of core methods)
 * 
 * @author Jean-francois Nepton
 * @version %I%, %G%
 * @since 1.0
 */
public class MailingAddressTest {

	/**
	 * Test method for
	 * {@link com.jfbuilds.tme1.program2.MailingAddress#MailingAddress()}.
	 */
	@Test
	public void testMailingAddress() {
		Logger log = LogManager.getLogger("com.jfbuilds.tme1.program2");
		log.info("Performing Test:" + "testMailingAddress - ");
		if (true) {
			assert (true);
		} else {
			fail("failMessage");
		}
		// TODO
	}

	/**
	 * Test method for
	 * {@link com.jfbuilds.tme1.program2.MailingAddress#MailingAddress(com.jfbuilds.tme1.program2.FullName, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)}
	 * .
	 */
	@Test
	public void testMailingAddressFullNameStringStringStringStringString() {
		Logger log = LogManager.getLogger("com.jfbuilds.tme1.program2");
		log.info("Performing Test:" + "testMailingAddressFullNameStringStringStringStringString - ");
		if (true) {
			assert (true);
		} else {
			fail("failMessage");
		}
		// TODO
	}

	/**
	 * Test method for
	 * {@link com.jfbuilds.tme1.program2.MailingAddress#toString()}.
	 */
	@Test
	public void testToString() {
		Logger log = LogManager.getLogger("com.jfbuilds.tme1.program2");
		log.info("Performing Test:" + "testToString - ");
		if (true) {
			assert (true);
		} else {
			fail("failMessage");
		}
	}
}
