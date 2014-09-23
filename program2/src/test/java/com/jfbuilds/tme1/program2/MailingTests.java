/**
 * File Name: MailingTests.java Jean-francois Nepton COMP 308 Java for
 * Programmers Cordinator: Dr. Xiaokun Zhang Student ID# 2358976 Created: Sep
 * 23, 2014
 */
package com.jfbuilds.tme1.program2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * MailingTests (description of class)
 * <p>
 * (description of core fields)
 * <p>
 * (description of core methods)
 * 
 * @author Jean-francois Nepton
 * @version %I%, %G%
 * @since 1.0
 */
@RunWith(Suite.class)
@SuiteClasses({ FullNameTest.class, MailingAddressTest.class, ShippingTest.class })
public class MailingTests {

	public static final Logger log = LogManager.getLogger(MailingTests.class);
}
