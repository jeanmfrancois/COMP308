/**
 * File Name: InstrumentTests.java<br>
 * Jean-francois Nepton<br>
 * COMP 308 Java for Programmers<br>
 * Cordinator: Dr. Xiaokun Zhang<br>
 * Student ID# 2358976<br>
 * Created: Sep 23, 2014
 */
package com.jfbuilds.tme1.program4;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * InstrumentTests (description of class)
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
@SuiteClasses({ Music5Test.class })
public class InstrumentTests {

	final static Logger log = LogManager.getLogger(InstrumentTests.class);
}
