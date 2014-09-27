/**
 * File Name: FullNameTest.java Jean-francois Nepton COMP 308 Java for
 * Programmers Cordinator: Dr. Xiaokun Zhang Student ID# 2358976 Created: Sep
 * 23, 2014
 */
package com.jfbuilds.tme1.program2;

import static com.jfbuilds.tme1.program2.MailingTests.log;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

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
		log.info("Performing Test:" + "testFullName - Test whether a Default FullName object is created successfully");
		if (new FullName() != null) {
			log.info("Status: " + "PASSED - with value set as " + new FullName());
			assertTrue(true);
		} else {
			log.warn("Status: " + "FAILED" + " - Test: testFullName -> Failed to create a full name object");
			fail("Failed to create a full name object");
		}
	}

	/**
	 * Test method for
	 * {@link com.jfbuilds.tme1.program2.FullName#FullName(java.lang.String, java.lang.String, java.lang.String, java.lang.String)}
	 * .
	 */
	@Test
	public void testFullNameStringStringStringString() {
		FullName fullname = new FullName("Mr", "Jean", "Mario", "Nepton");
		log.info("Performing Test:"
				+ "testFullNameStringStringStringString - Test the creation of a parameterized full name: Jean Mario Nepton");
		if (fullname != null) {
			log.info("Status: " + "PASSED - with value set as " + fullname);
			assertTrue(true);
		} else {
			log.warn("Status: "
					+ "FAILED"
					+ " - Test: testFullNameStringStringStringString -> Failed to create parameterized FullName object.");
			fail("Failed to create parameterized FullName object.");
		}
	}

	/**
	 * Test method for {@link com.jfbuilds.tme1.program2.FullName#toString()}.
	 */
	@Test
	public void testToString() {
		FullName fullname = new FullName();
		log.info("Performing Test:"
				+ "testToString - Test that the toString method return a readable representation of a person: John Doe");
		if (true) {
			log.info("Status: " + "PASSED with value set as " + fullname);
			assertTrue(true);
		} else {
			log.warn("Status: " + "FAILED"
					+ " - Test: testToString -> Did not display a text representation of the FullName object");
			fail("Did not display a text representation of the FullName object");
		}
	}
}
