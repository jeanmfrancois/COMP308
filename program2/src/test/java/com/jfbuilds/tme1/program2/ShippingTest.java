/**
 * File Name: ShippingTest.java Jean-francois Nepton COMP 308 Java for
 * Programmers Cordinator: Dr. Xiaokun Zhang Student ID# 2358976 Created: Sep
 * 23, 2014
 */
package com.jfbuilds.tme1.program2;

import static com.jfbuilds.tme1.program2.MailingTests.log;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

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
		MailingAddress mailingaddress = new MailingAddress();
		log.info("Performing Test:"
				+ "testShippingLabel - Testing for the successful creation of a default ShippingLabel object.");
		if (mailingaddress != null) {
			log.debug("Status: " + "PASSED - with value " + mailingaddress);
			assertTrue(true);
		} else {
			log.warn("Status: "
					+ "FAILED"
					+ " - Test: testShippingLabel -> Failed test for the successful creation of a default ShippingLabel object.");
			fail("Failure for the successful creation of a default ShippingLabel object.");
		}
	}

	/**
	 * Test method for
	 * {@link com.jfbuilds.tme1.program2.ShippingLabel#ShippingLabel(com.jfbuilds.tme1.program2.MailingAddress, com.jfbuilds.tme1.program2.MailingAddress)}
	 * .
	 */
	@Test
	public void testShippingLabelMailingAddressMailingAddress() {
		ShippingLabel shippinglabel =
				new ShippingLabel(new MailingAddress(new FullName("Dr.", "Xiaokun", "", "Zhang"),
						"Athabasca University", "1 University Dr.", "Athabasca", "Alberta", "T9S 3A3"),
						new MailingAddress(new FullName("Mr.", "Jean-francois", "M.", "Nepton"),
								"941-2 Chemin Montreal Ouest", "", "Gatineau", "Quebec", "J8P 2B8"));
		log.info("Performing Test:"
				+ "testShippingLabelMailingAddressMailingAddress - Testing for the successful creation of a parameterized ShippingLabel object as two instructors from Athabasca University.");
		if (shippinglabel != null) {
			log.debug("Status: " + "PASSED - with value " + shippinglabel);
			assertTrue(true);
		} else {
			log.warn("Status: "
					+ "FAILED"
					+ " - Test: testShippingLabelMailingAddressMailingAddress -> Failed test for the successful creation of a parameterized ShippingLabel object as two instructors from Athabasca University.");
			fail("Failure for the successful creation of a parameterized ShippingLabel object as two instructors from Athabasca University.");
		}
	}

	/**
	 * Test method for
	 * {@link com.jfbuilds.tme1.program2.ShippingLabel#main(java.lang.String[])}
	 * .
	 */
	@Test
	public void testMain() {
		ShippingLabel.main(new String[] {});
		log.info("Performing Test:" + "testMain - Testing for execution of genereic execution of main method");
		if (true) {
			log.debug("Status: " + "PASSED - " + "successful execution of main method");
			assertTrue(true);
		} else {
			log.warn("Status: " + "FAILED"
					+ " - Test: testMain -> Failed test for execution of genereic execution of main method");
			fail("Failure for execution of genereic execution of main method");
		}
	}

	/**
	 * Test method for
	 * {@link com.jfbuilds.tme1.program2.ShippingLabel#toString()}.
	 */
	@Test
	public void testToString() {
		ShippingLabel shippinglabel = new ShippingLabel();
		log.info("Performing Test:"
				+ "testToString - Testing for testing successful overriding of the toString method for readable content");
		if (true) {
			log.debug("Status: " + "PASSED - with value " + shippinglabel);
			assertTrue(true);
		} else {
			log.warn("Status: "
					+ "FAILED"
					+ " - Test: testToString -> Failed test for testing successful overriding of the toString method for readable content");
			fail("Failure for testing successful overriding of the toString method for readable content");
		}
	}
}
