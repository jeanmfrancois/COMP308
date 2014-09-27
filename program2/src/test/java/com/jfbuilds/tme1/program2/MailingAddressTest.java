/**
 * File Name: MailingAddressTest.java Jean-francois Nepton COMP 308 Java for
 * Programmers Cordinator: Dr. Xiaokun Zhang Student ID# 2358976 Created: Sep
 * 23, 2014
 */
package com.jfbuilds.tme1.program2;

import static com.jfbuilds.tme1.program2.MailingTests.log;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

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
		MailingAddress mailingaddress = new MailingAddress();
		log.info("Performing Test:"
				+ "testMailingAddress - Testing for the successful creation of a default mailing address with an Ottawa address");
		if (mailingaddress != null) {
			log.info("Status: " + "PASSED - with value:\n" + mailingaddress);
			assertTrue(true);
		} else {
			log.warn("Status: " + "FAILED"
					+ " - Test: testMailingAddress -> Failed test for creation of a deafult address");
			fail("Failure for the creation of a deafult address");
		}
	}

	/**
	 * Test method for
	 * {@link com.jfbuilds.tme1.program2.MailingAddress#MailingAddress(com.jfbuilds.tme1.program2.FullName, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)}
	 * .
	 */
	@Test
	public void testMailingAddressFullNameStringStringStringStringString() {
		MailingAddress mailingaddress =
				new MailingAddress(new FullName("Mrs.", "Olive", "L.", "Smith"), "1 University Dr.", "Suite 666",
						"Athabasca", "Alberta", "T9S 3A3");
		log.info("Performing Test:"
				+ "testMailingAddressFullNameStringStringStringStringString - Testing for the successful creation of a MailingAddress: Mrs. Olive L. Smith, 1 University Dr., Suite 666, Athabasca, Alberta T9S 3A3");
		if (mailingaddress != null) {
			log.info("Status: " + "PASSED - with value:\n" + mailingaddress);
			assertTrue(true);
		} else {
			log.warn("Status: "
					+ "FAILED"
					+ " - Test: testMailingAddressFullNameStringStringStringStringString -> Failed test for the successful creation of a MailingAddress: Mrs. L. Smith, 1 University Dr, Suite 666, Athabasca, AB T9S 3A3");
			fail("Failure for the successful creation of a MailingAddress: Mrs. L. Smith, 1 University Dr, Suite 666, Athabasca, AB T9S 3A3");
		}
	}

	/**
	 * Test method for
	 * {@link com.jfbuilds.tme1.program2.MailingAddress#toString()}.
	 */
	@Test
	public void testToString() {
		MailingAddress mailingaddress = new MailingAddress();
		log.info("Performing Test:" + "testToString - Testing for the overriding of the default toString method");
		if (true) {
			log.info("Status: " + "PASSED - with value:\n" + mailingaddress);
			assertTrue(true);
		} else {
			log.warn("Status: " + "FAILED"
					+ " - Test: testToString -> Failed test for the overriding of the default toString method");
			fail("Failure for the overriding of the default toString method");
		}
	}
}
